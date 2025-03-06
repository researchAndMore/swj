/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlSchemaType
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;



import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TActivity", propOrder={"activityName", "synonym", "includedActivitiesStart", "includedActivitiesEnd", "allocationComment", "generalComment", "tag", "any"})
public class TActivity {
    @XmlElement(required=true)
    protected List<TString120> activityName;
    protected List<TSynonym> synonym;
    protected List<TString32000> includedActivitiesStart;
    protected List<TString32000> includedActivitiesEnd;
    protected TTextAndImage allocationComment;
    protected TTextAndImage generalComment;
    protected List<TTag> tag;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="activityNameId", required=true)
    protected String activityNameId;
    @XmlAttribute(name="activityNameContextId")
    protected String activityNameContextId;
    @XmlAttribute(name="parentActivityId")
    protected String parentActivityId;
    @XmlAttribute(name="parentActivityContextId")
    protected String parentActivityContextId;
    @XmlAttribute(name="inheritanceDepth")
    protected BigInteger inheritanceDepth;
    @XmlAttribute(name="type", required=true)
    protected int type;
    @XmlAttribute(name="specialActivityType", required=true)
    protected int specialActivityType;
    @XmlAttribute(name="energyValues")
    protected Integer energyValues;
    @XmlAttribute(name="masterAllocationPropertyId")
    protected String masterAllocationPropertyId;
    @XmlAttribute(name="masterAllocationPropertyIdOverwrittenByChild")
    protected Boolean masterAllocationPropertyIdOverwrittenByChild;
    @XmlAttribute(name="masterAllocationPropertyContextId")
    protected String masterAllocationPropertyContextId;
    @XmlAttribute(name="datasetIcon")
    @XmlSchemaType(name="anyURI")
    protected String datasetIcon;

    public List<TString120> getActivityName() {
        if (this.activityName == null) {
            this.activityName = new ArrayList<TString120>();
        }
        return this.activityName;
    }

    public List<TSynonym> getSynonym() {
        if (this.synonym == null) {
            this.synonym = new ArrayList<TSynonym>();
        }
        return this.synonym;
    }

    public List<TString32000> getIncludedActivitiesStart() {
        if (this.includedActivitiesStart == null) {
            this.includedActivitiesStart = new ArrayList<TString32000>();
        }
        return this.includedActivitiesStart;
    }

    public List<TString32000> getIncludedActivitiesEnd() {
        if (this.includedActivitiesEnd == null) {
            this.includedActivitiesEnd = new ArrayList<TString32000>();
        }
        return this.includedActivitiesEnd;
    }

    public TTextAndImage getAllocationComment() {
        return this.allocationComment;
    }

    public void setAllocationComment(TTextAndImage value) {
        this.allocationComment = value;
    }

    public TTextAndImage getGeneralComment() {
        return this.generalComment;
    }

    public void setGeneralComment(TTextAndImage value) {
        this.generalComment = value;
    }

    public List<TTag> getTag() {
        if (this.tag == null) {
            this.tag = new ArrayList<TTag>();
        }
        return this.tag;
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

    public String getActivityNameId() {
        return this.activityNameId;
    }

    public void setActivityNameId(String value) {
        this.activityNameId = value;
    }

    public String getActivityNameContextId() {
        return this.activityNameContextId;
    }

    public void setActivityNameContextId(String value) {
        this.activityNameContextId = value;
    }

    public String getParentActivityId() {
        return this.parentActivityId;
    }

    public void setParentActivityId(String value) {
        this.parentActivityId = value;
    }

    public String getParentActivityContextId() {
        return this.parentActivityContextId;
    }

    public void setParentActivityContextId(String value) {
        this.parentActivityContextId = value;
    }

    public BigInteger getInheritanceDepth() {
        if (this.inheritanceDepth == null) {
            return new BigInteger("0");
        }
        return this.inheritanceDepth;
    }

    public void setInheritanceDepth(BigInteger value) {
        this.inheritanceDepth = value;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int value) {
        this.type = value;
    }

    public int getSpecialActivityType() {
        return this.specialActivityType;
    }

    public void setSpecialActivityType(int value) {
        this.specialActivityType = value;
    }

    public int getEnergyValues() {
        if (this.energyValues == null) {
            return 0;
        }
        return this.energyValues;
    }

    public void setEnergyValues(Integer value) {
        this.energyValues = value;
    }

    public String getMasterAllocationPropertyId() {
        return this.masterAllocationPropertyId;
    }

    public void setMasterAllocationPropertyId(String value) {
        this.masterAllocationPropertyId = value;
    }

    public Boolean isMasterAllocationPropertyIdOverwrittenByChild() {
        return this.masterAllocationPropertyIdOverwrittenByChild;
    }

    public void setMasterAllocationPropertyIdOverwrittenByChild(Boolean value) {
        this.masterAllocationPropertyIdOverwrittenByChild = value;
    }

    public String getMasterAllocationPropertyContextId() {
        return this.masterAllocationPropertyContextId;
    }

    public void setMasterAllocationPropertyContextId(String value) {
        this.masterAllocationPropertyContextId = value;
    }

    public String getDatasetIcon() {
        return this.datasetIcon;
    }

    public void setDatasetIcon(String value) {
        this.datasetIcon = value;
    }
}
