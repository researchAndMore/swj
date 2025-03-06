/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidPerson", propOrder={"companyName", "any"})
public class TValidPerson {
    protected List<TString255> companyName;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="name", required=true)
    protected String name;
    @XmlAttribute(name="address")
    protected String address;
    @XmlAttribute(name="telephone")
    protected String telephone;
    @XmlAttribute(name="telefax")
    protected String telefax;
    @XmlAttribute(name="email", required=true)
    protected String email;
    @XmlAttribute(name="companyId")
    protected String companyId;
    @XmlAttribute(name="companyContextId")
    protected String companyContextId;

    public List<TString255> getCompanyName() {
        if (this.companyName == null) {
            this.companyName = new ArrayList<TString255>();
        }
        return this.companyName;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String value) {
        this.telephone = value;
    }

    public String getTelefax() {
        return this.telefax;
    }

    public void setTelefax(String value) {
        this.telefax = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String value) {
        this.companyId = value;
    }

    public String getCompanyContextId() {
        return this.companyContextId;
    }

    public void setCompanyContextId(String value) {
        this.companyContextId = value;
    }
}
