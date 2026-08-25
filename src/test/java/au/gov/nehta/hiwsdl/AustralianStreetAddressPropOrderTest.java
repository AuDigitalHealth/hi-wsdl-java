package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import javax.xml.bind.annotation.XmlType;
import org.junit.Test;

/**
 * Locks JAXB {@code propOrder} for {@code AustralianStreetAddressType} against
 * the licensed Address schema.
 */
public class AustralianStreetAddressPropOrderTest {

    @Test
    public void australianStreetAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AustralianStreetAddressType",
                new String[] {
                        "state",
                        "postcode",
                        "suburb",
                        "addressSiteName",
                        "unitGroup",
                        "levelGroup",
                        "lotNumber",
                        "streetNumber",
                        "streetName",
                        "streetType",
                        "streetSuffix"
                });
    }

    @Test
    public void australianUnstructuredStreetAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AustralianUnstructuredStreetAddressType",
                new String[] {
                        "addressLineOne",
                        "addressLineTwo",
                        "suburb",
                        "state",
                        "postcode"
                });
    }

    @Test
    public void searchAustralianAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0.SearchAustralianAddressType",
                new String[] {
                        "unitGroup",
                        "levelGroup",
                        "addressSiteName",
                        "streetNumber",
                        "lotNumber",
                        "streetName",
                        "streetType",
                        "streetSuffix",
                        "postalDeliveryGroup",
                        "suburb",
                        "state",
                        "postcode"
                });
    }

    private static void assertPropOrder(String className, String[] expected) throws Exception {
        Class<?> type = Class.forName(className);
        XmlType xmlType = type.getAnnotation(XmlType.class);
        assertNotNull(className + " missing @XmlType", xmlType);
        assertArrayEquals(className, expected, xmlType.propOrder());
    }
}
