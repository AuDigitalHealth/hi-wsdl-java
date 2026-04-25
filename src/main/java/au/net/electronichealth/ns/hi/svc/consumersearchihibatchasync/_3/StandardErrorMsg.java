package au.net.electronichealth.ns.hi.svc.consumersearchihibatchasync._3;

import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;

import javax.xml.ws.WebFault;


@WebFault(name = "serviceMessages", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
public class StandardErrorMsg extends Exception {

    private ServiceMessagesType faultInfo;

    public StandardErrorMsg(String message, ServiceMessagesType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public StandardErrorMsg(String message, ServiceMessagesType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public ServiceMessagesType getFaultInfo() {
        return faultInfo;
    }

}
