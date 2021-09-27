// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Lookup")
public class Lookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "lookupSid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="lookup_sid", unique=true, nullable=false)
    private int lookupSid;
    @Column(name="lookup_domain_code", length=45)
    private String lookupDomainCode;
    @Column(name="lookup_name", length=45)
    private String lookupName;
    @Column(name="lookup_desc", length=45)
    private String lookupDesc;
    @Column(name="lookup_flag", length=45)
    private String lookupFlag;
    @Column(name="lookup_title", length=45)
    private String lookupTitle;
    @Column(name="lookup_value", length=45)
    private String lookupValue;
    @Column(name="created_date", length=45)
    private String createdDate;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public Lookup() {
        super();
    }

    /**
     * Access method for lookupSid.
     *
     * @return the current value of lookupSid
     */
    public int getLookupSid() {
        return lookupSid;
    }

    /**
     * Setter method for lookupSid.
     *
     * @param aLookupSid the new value for lookupSid
     */
    public void setLookupSid(int aLookupSid) {
        lookupSid = aLookupSid;
    }

    /**
     * Access method for lookupDomainCode.
     *
     * @return the current value of lookupDomainCode
     */
    public String getLookupDomainCode() {
        return lookupDomainCode;
    }

    /**
     * Setter method for lookupDomainCode.
     *
     * @param aLookupDomainCode the new value for lookupDomainCode
     */
    public void setLookupDomainCode(String aLookupDomainCode) {
        lookupDomainCode = aLookupDomainCode;
    }

    /**
     * Access method for lookupName.
     *
     * @return the current value of lookupName
     */
    public String getLookupName() {
        return lookupName;
    }

    /**
     * Setter method for lookupName.
     *
     * @param aLookupName the new value for lookupName
     */
    public void setLookupName(String aLookupName) {
        lookupName = aLookupName;
    }

    /**
     * Access method for lookupDesc.
     *
     * @return the current value of lookupDesc
     */
    public String getLookupDesc() {
        return lookupDesc;
    }

    /**
     * Setter method for lookupDesc.
     *
     * @param aLookupDesc the new value for lookupDesc
     */
    public void setLookupDesc(String aLookupDesc) {
        lookupDesc = aLookupDesc;
    }

    /**
     * Access method for lookupFlag.
     *
     * @return the current value of lookupFlag
     */
    public String getLookupFlag() {
        return lookupFlag;
    }

    /**
     * Setter method for lookupFlag.
     *
     * @param aLookupFlag the new value for lookupFlag
     */
    public void setLookupFlag(String aLookupFlag) {
        lookupFlag = aLookupFlag;
    }

    /**
     * Access method for lookupTitle.
     *
     * @return the current value of lookupTitle
     */
    public String getLookupTitle() {
        return lookupTitle;
    }

    /**
     * Setter method for lookupTitle.
     *
     * @param aLookupTitle the new value for lookupTitle
     */
    public void setLookupTitle(String aLookupTitle) {
        lookupTitle = aLookupTitle;
    }

    /**
     * Access method for lookupValue.
     *
     * @return the current value of lookupValue
     */
    public String getLookupValue() {
        return lookupValue;
    }

    /**
     * Setter method for lookupValue.
     *
     * @param aLookupValue the new value for lookupValue
     */
    public void setLookupValue(String aLookupValue) {
        lookupValue = aLookupValue;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(String aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for createdBy.
     *
     * @return the current value of createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter method for createdBy.
     *
     * @param aCreatedBy the new value for createdBy
     */
    public void setCreatedBy(String aCreatedBy) {
        createdBy = aCreatedBy;
    }

    /**
     * Access method for modifiedDate.
     *
     * @return the current value of modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Setter method for modifiedDate.
     *
     * @param aModifiedDate the new value for modifiedDate
     */
    public void setModifiedDate(String aModifiedDate) {
        modifiedDate = aModifiedDate;
    }

    /**
     * Access method for modifiedBy.
     *
     * @return the current value of modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Setter method for modifiedBy.
     *
     * @param aModifiedBy the new value for modifiedBy
     */
    public void setModifiedBy(String aModifiedBy) {
        modifiedBy = aModifiedBy;
    }

    /**
     * Access method for oprtlnFlag.
     *
     * @return the current value of oprtlnFlag
     */
    public String getOprtlnFlag() {
        return oprtlnFlag;
    }

    /**
     * Setter method for oprtlnFlag.
     *
     * @param aOprtlnFlag the new value for oprtlnFlag
     */
    public void setOprtlnFlag(String aOprtlnFlag) {
        oprtlnFlag = aOprtlnFlag;
    }

    /**
     * Compares the key for this instance with another Lookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Lookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Lookup)) {
            return false;
        }
        Lookup that = (Lookup) other;
        if (this.getLookupSid() != that.getLookupSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Lookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Lookup)) return false;
        return this.equalKeys(other) && ((Lookup)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getLookupSid();
        result = 37*result + i;
        return result;
    }
}