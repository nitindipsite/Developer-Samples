
package com.checkbox.ftpresponseexporter.authentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOperationResultOfboolean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOperationResultOfboolean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FailureExceptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOperationResultOfboolean", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", propOrder = {
    "callSuccess",
    "failureExceptionType",
    "failureMessage",
    "resultData"
})
public class ServiceOperationResultOfboolean {

    @XmlElement(name = "CallSuccess")
    protected Boolean callSuccess;
    @XmlElementRef(name = "FailureExceptionType", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> failureExceptionType;
    @XmlElementRef(name = "FailureMessage", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> failureMessage;
    @XmlElement(name = "ResultData")
    protected Boolean resultData;

    /**
     * Gets the value of the callSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallSuccess() {
        return callSuccess;
    }

    /**
     * Sets the value of the callSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallSuccess(Boolean value) {
        this.callSuccess = value;
    }

    /**
     * Gets the value of the failureExceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureExceptionType() {
        return failureExceptionType;
    }

    /**
     * Sets the value of the failureExceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureExceptionType(JAXBElement<String> value) {
        this.failureExceptionType = value;
    }

    /**
     * Gets the value of the failureMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureMessage() {
        return failureMessage;
    }

    /**
     * Sets the value of the failureMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureMessage(JAXBElement<String> value) {
        this.failureMessage = value;
    }

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResultData(Boolean value) {
        this.resultData = value;
    }

}
