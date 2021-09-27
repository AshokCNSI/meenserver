// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="District")
public class District implements Serializable {

    /** Primary key. */
    protected static final String PK = "districtCid";

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
    @Column(name="district_cid", unique=true, nullable=false)
    private int districtCid;
    @Column(name="district_code", length=45)
    private String districtCode;
    @Column(name="district_name", length=45)
    private String districtName;
    @Column(name="district_desc", length=45)
    private String districtDesc;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="created_date", length=45)
    private String createdDate;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public District() {
        super();
    }

    /**
     * Access method for districtCid.
     *
     * @return the current value of districtCid
     */
    public int getDistrictCid() {
        return districtCid;
    }

    /**
     * Setter method for districtCid.
     *
     * @param aDistrictCid the new value for districtCid
     */
    public void setDistrictCid(int aDistrictCid) {
        districtCid = aDistrictCid;
    }

    /**
     * Access method for districtCode.
     *
     * @return the current value of districtCode
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * Setter method for districtCode.
     *
     * @param aDistrictCode the new value for districtCode
     */
    public void setDistrictCode(String aDistrictCode) {
        districtCode = aDistrictCode;
    }

    /**
     * Access method for districtName.
     *
     * @return the current value of districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Setter method for districtName.
     *
     * @param aDistrictName the new value for districtName
     */
    public void setDistrictName(String aDistrictName) {
        districtName = aDistrictName;
    }

    /**
     * Access method for districtDesc.
     *
     * @return the current value of districtDesc
     */
    public String getDistrictDesc() {
        return districtDesc;
    }

    /**
     * Setter method for districtDesc.
     *
     * @param aDistrictDesc the new value for districtDesc
     */
    public void setDistrictDesc(String aDistrictDesc) {
        districtDesc = aDistrictDesc;
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
     * Compares the key for this instance with another District.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class District and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof District)) {
            return false;
        }
        District that = (District) other;
        if (this.getDistrictCid() != that.getDistrictCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another District.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof District)) return false;
        return this.equalKeys(other) && ((District)other).equalKeys(this);
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
        i = getDistrictCid();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[District |");
        sb.append(" districtCid=").append(getDistrictCid());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("districtCid", Integer.valueOf(getDistrictCid()));
        return ret;
    }

}
