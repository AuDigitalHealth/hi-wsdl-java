package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import javax.xml.bind.annotation.XmlType;
import org.junit.Test;

/**
 * Locks JAXB {@code propOrder} for Consumer Search IHI request types shipped in this JAR.
 */
public class SearchIhiPropOrderTest {

    @Test
    public void messagesSearchIhiElectronicCommunicationBeforeDateOfBirth() throws Exception {
        assertPropOrder(
            "au.net.electronichealth.ns.hi.xsd.consumermessages.searchihi._3.SearchIHI",
            new String[] {
                "ihiNumber",
                "medicareCardNumber",
                "medicareIRN",
                "dvaFileNumber",
                "electronicCommunication",
                "dateOfBirth",
                "sex",
                "familyName",
                "givenName",
                "australianPostalAddress",
                "australianStreetAddress",
                "internationalAddress",
                "australianUnstructuredStreetAddress",
                "history"
            }
        );
    }

    @Test
    public void interfaceSearchIhiElectronicCommunicationBeforeDateOfBirth() throws Exception {
        assertPropOrder(
            "au.net.electronichealth.ns.hi.svc.consumersearchihi._3.SearchIHI",
            new String[] {
                "ihiNumber",
                "medicareCardNumber",
                "medicareIRN",
                "dvaFileNumber",
                "electronicCommunication",
                "dateOfBirth",
                "sex",
                "familyName",
                "givenName",
                "australianPostalAddress",
                "australianStreetAddress",
                "australianUnstructuredStreetAddress",
                "internationalAddress",
                "history"
            }
        );
    }

    private static void assertPropOrder(String className, String[] expected) throws Exception {
        Class<?> type = Class.forName(className);
        XmlType xmlType = type.getAnnotation(XmlType.class);
        assertNotNull(className + " missing @XmlType", xmlType);
        assertArrayEquals(className, expected, xmlType.propOrder());
    }
}
