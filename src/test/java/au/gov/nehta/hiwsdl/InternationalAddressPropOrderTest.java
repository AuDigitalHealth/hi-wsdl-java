package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import javax.xml.bind.annotation.XmlType;
import org.junit.Test;

/**
 * Locks JAXB {@code propOrder} for international address types against
 * the licensed Address schemas.
 */
public class InternationalAddressPropOrderTest {

    @Test
    public void consumerInternationalAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.consumercore.address._3.InternationalAddressType",
                new String[] {
                        "internationalStateProvince",
                        "country",
                        "internationalPostcode",
                        "internationalAddressLine"
                });
    }

    @Test
    public void providerInternationalAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressType",
                new String[] {
                        "internationalAddressLine",
                        "internationalStateProvince",
                        "internationalPostcode",
                        "country"
                });
    }

    @Test
    public void providerInternationalAddressCriteriaMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType",
                new String[] {
                        "internationalAddressLine",
                        "internationalStateProvince",
                        "internationalPostcode",
                        "country"
                });
    }

    @Test
    public void searchInternationalAddressMatchesLicensedSchemaSequence() throws Exception {
        assertPropOrder(
                "au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0.SearchInternationalAddressType",
                new String[] {
                        "internationalAddressLine",
                        "internationalStateProvince",
                        "internationalPostcode",
                        "country"
                });
    }

    private static void assertPropOrder(String className, String[] expected) throws Exception {
        Class<?> type = Class.forName(className);
        XmlType xmlType = type.getAnnotation(XmlType.class);
        assertNotNull(className + " missing @XmlType", xmlType);
        assertArrayEquals(className, expected, xmlType.propOrder());
    }
}
