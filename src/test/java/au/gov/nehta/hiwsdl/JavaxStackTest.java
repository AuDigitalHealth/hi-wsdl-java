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

public class JavaxStackTest {

    @Test
    public void compileDependenciesAreJavaxApis() throws Exception {
        assertNotNull(Class.forName("javax.xml.bind.JAXBContext"));
        assertNotNull(Class.forName("javax.xml.ws.Service"));
        assertNotNull(Class.forName("javax.jws.WebMethod"));
        try {
            Class.forName("jakarta.xml.bind.JAXBContext");
            fail("jakarta.xml.bind must not be on the compile/test classpath");
        } catch (ClassNotFoundException expected) {
            // javax line only
        }
    }

    @Test
    public void generatedSourcesDoNotImportJakarta() throws Exception {
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
                if (content.contains("import jakarta.")) {
                    found[0] = true;
                    offenders.append(System.lineSeparator()).append(root.relativize(file));
                }
                return FileVisitResult.CONTINUE;
            }
        });

        assertFalse("Generated sources must use javax imports only:" + offenders, found[0]);
    }
}
