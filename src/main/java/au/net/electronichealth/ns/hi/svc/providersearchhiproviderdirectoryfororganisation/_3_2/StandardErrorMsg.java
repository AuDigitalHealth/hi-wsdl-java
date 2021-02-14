
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2;

import javax.xml.ws.WebFault;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "serviceMessages", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
public class StandardErrorMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceMessagesType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public StandardErrorMsg(String message, ServiceMessagesType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public StandardErrorMsg(String message, ServiceMessagesType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType
     */
    public ServiceMessagesType getFaultInfo() {
        return faultInfo;
    }

}
