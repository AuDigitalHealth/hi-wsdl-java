package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.junit.Test;

/**
 * Locks the Jakarta XML stack on this Java 17 line (no legacy javax JAX-WS/JAXB).
 */
public class JakartaStackTest {

    @Test
    public void compileDependenciesAreJakartaApis() throws Exception {
        assertNotNull(Class.forName("jakarta.xml.bind.JAXBContext"));
        assertNotNull(Class.forName("jakarta.xml.ws.Service"));
        assertNotNull(Class.forName("jakarta.jws.WebMethod"));
        try {
            Class.forName("javax.xml.bind.JAXBContext");
            fail("javax.xml.bind must not be on the compile/test classpath");
        } catch (ClassNotFoundException expected) {
            // Jakarta line only
        }
    }

    @Test
    public void generatedSourcesDoNotImportLegacyJavaxApis() throws Exception {
        Path root = Paths.get("src/main/java");
        final boolean[] found = {false};
        final StringBuilder offenders = new StringBuilder();

        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws java.io.IOException {
                if (!file.toString().endsWith(".java")) {
                    return FileVisitResult.CONTINUE;
                }
                String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
                if (content.contains("import javax.jws")
                        || content.contains("import javax.xml.bind")
                        || content.contains("import javax.xml.ws")) {
                    found[0] = true;
                    offenders.append(System.lineSeparator()).append(root.relativize(file));
                }
                return FileVisitResult.CONTINUE;
            }
        });

        assertFalse("Generated sources must use Jakarta XML Web Services imports:" + offenders, found[0]);
    }
}
