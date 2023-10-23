//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.23 at 09:33:22 AM BST 
//


package com.narayanjoshi.simplesoapserverapp.gs_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profile_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="profile_base64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileUrl",
    "profileBase64"
})
@XmlRootElement(name = "uploadProfilePictureRequest")
public class UploadProfilePictureRequest {

    @XmlElement(name = "profile_url", required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String profileUrl;
    @XmlElement(name = "profile_base64", required = true, nillable = true)
    protected byte[] profileBase64;

    /**
     * Gets the value of the profileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Sets the value of the profileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileUrl(String value) {
        this.profileUrl = value;
    }

    /**
     * Gets the value of the profileBase64 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getProfileBase64() {
        return profileBase64;
    }

    /**
     * Sets the value of the profileBase64 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setProfileBase64(byte[] value) {
        this.profileBase64 = value;
    }

}