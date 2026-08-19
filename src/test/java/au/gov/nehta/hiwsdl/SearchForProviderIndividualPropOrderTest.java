package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import jakarta.xml.bind.annotation.XmlType;
import org.junit.Test;

/**
 * Locks JAXB {@code propOrder} for HI31 Search for Provider Individual request types.
 */
public class SearchForProviderIndividualPropOrderTest {

    private static final String[] XSD_SEQUENCE = {
        "hpiiNumber",
        "registrationId",
        "familyName",
        "onlyNameIndicator",
        "givenName",
        "dateOfBirth",
        "sex",
        "state",
        "postcode",
        "searchAustralianAddress",
        "searchInternationalAddress"
    };

    @Test
    public void hi31SvcSearchForProviderIndividualMatchesLicensedXsd() throws Exception {
        assertPropOrder(
            "au.net.electronichealth.ns.hi.svc.providersearchforproviderindividual._5_0.SearchForProviderIndividual",
            XSD_SEQUENCE
        );
    }

    @Test
    public void hi33MessagesSearchForProviderIndividualMatchesLicensedXsd() throws Exception {
        assertPropOrder(
            "au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0.SearchForProviderIndividual",
            XSD_SEQUENCE
        );
    }

    private static void assertPropOrder(String className, String[] expected) throws Exception {
        Class<?> type = Class.forName(className);
        XmlType xmlType = type.getAnnotation(XmlType.class);
        assertNotNull(className + " missing @XmlType", xmlType);
        assertArrayEquals(className, expected, xmlType.propOrder());
    }
}
