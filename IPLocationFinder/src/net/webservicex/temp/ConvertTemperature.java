
package net.webservicex.temp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConvertTemperature", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/ConvertTemperature.asmx?WSDL")
public class ConvertTemperature
    extends Service
{

    private final static URL CONVERTTEMPERATURE_WSDL_LOCATION;
    private final static WebServiceException CONVERTTEMPERATURE_EXCEPTION;
    private final static QName CONVERTTEMPERATURE_QNAME = new QName("http://www.webserviceX.NET/", "ConvertTemperature");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/ConvertTemperature.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTTEMPERATURE_WSDL_LOCATION = url;
        CONVERTTEMPERATURE_EXCEPTION = e;
    }

    public ConvertTemperature() {
        super(__getWsdlLocation(), CONVERTTEMPERATURE_QNAME);
    }

    public ConvertTemperature(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTTEMPERATURE_QNAME, features);
    }

    public ConvertTemperature(URL wsdlLocation) {
        super(wsdlLocation, CONVERTTEMPERATURE_QNAME);
    }

    public ConvertTemperature(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTTEMPERATURE_QNAME, features);
    }

    public ConvertTemperature(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertTemperature(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConvertTemperatureSoap
     */
    @WebEndpoint(name = "ConvertTemperatureSoap")
    public ConvertTemperatureSoap getConvertTemperatureSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap"), ConvertTemperatureSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConvertTemperatureSoap
     */
    @WebEndpoint(name = "ConvertTemperatureSoap")
    public ConvertTemperatureSoap getConvertTemperatureSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap"), ConvertTemperatureSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTTEMPERATURE_EXCEPTION!= null) {
            throw CONVERTTEMPERATURE_EXCEPTION;
        }
        return CONVERTTEMPERATURE_WSDL_LOCATION;
    }

}