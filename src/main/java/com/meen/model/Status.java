// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Status")
public class Status implements Serializable {

    /** Primary key. */
    protected static final String PK = "statusCid";

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
    @Column(name="status_cid", unique=true, nullable=false)
    private int statusCid;
    @Column(name="status_name", nullable=false, length=45)
    private String statusName;
    @Column(name="status_desc", nullable=false, length=45)
    private String statusDesc;
    @Column(name="status_icon", nullable=false, length=45)
    private String statusIcon;
    @Column(name="status_code", length=45)
    private String statusCode;
    @Column(name="status_buffer", length=45)
    private String statusBuffer;
    @Column(name="status_color", length=45)
    private String statusColor;
    @Column(name="status_order", length=45)
    private String statusOrder;
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
    public Status() {
        super();
    }

    /**
     * Access method for statusCid.
     *
     * @return the current value of statusCid
     */
    public int getStatusCid() {
        return statusCid;
    }

    /**
     * Setter method for statusCid.
     *
     * @param aStatusCid the new value for statusCid
     */
    public void setStatusCid(int aStatusCid) {
        statusCid = aStatusCid;
    }

    /**
     * Access method for statusName.
     *
     * @return the current value of statusName
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Setter method for statusName.
     *
     * @param aStatusName the new value for statusName
     */
    public void setStatusName(String aStatusName) {
        statusName = aStatusName;
    }

    /**
     * Access method for statusDesc.
     *
     * @return the current value of statusDesc
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Setter method for statusDesc.
     *
     * @param aStatusDesc the new value for statusDesc
     */
    public void setStatusDesc(String aStatusDesc) {
        statusDesc = aStatusDesc;
    }

    /**
     * Access method for statusIcon.
     *
     * @return the current value of statusIcon
     */
    public String getStatusIcon() {
        return statusIcon;
    }

    /**
     * Setter method for statusIcon.
     *
     * @param aStatusIcon the new value for statusIcon
     */
    public void setStatusIcon(String aStatusIcon) {
        statusIcon = aStatusIcon;
    }

    /**
     * Access method for statusCode.
     *
     * @return the current value of statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Setter method for statusCode.
     *
     * @param aStatusCode the new value for statusCode
     */
    public void setStatusCode(String aStatusCode) {
        statusCode = aStatusCode;
    }

    /**
     * Access method for statusBuffer.
     *
     * @return the current value of statusBuffer
     */
    public String getStatusBuffer() {
        return statusBuffer;
    }

    /**
     * Setter method for statusBuffer.
     *
     * @param aStatusBuffer the new value for statusBuffer
     */
    public void setStatusBuffer(String aStatusBuffer) {
        statusBuffer = aStatusBuffer;
    }

    /**
     * Access method for statusColor.
     *
     * @return the current value of statusColor
     */
    public String getStatusColor() {
        return statusColor;
    }

    /**
     * Setter method for statusColor.
     *
     * @param aStatusColor the new value for statusColor
     */
    public void setStatusColor(String aStatusColor) {
        statusColor = aStatusColor;
    }

    /**
     * Access method for statusOrder.
     *
     * @return the current value of statusOrder
     */
    public String getStatusOrder() {
        return statusOrder;
    }

    /**
     * Setter method for statusOrder.
     *
     * @param aStatusOrder the new value for statusOrder
     */
    public void setStatusOrder(String aStatusOrder) {
        statusOrder = aStatusOrder;
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
     * Compares the key for this instance with another Status.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Status and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status that = (Status) other;
        if (this.getStatusCid() != that.getStatusCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Status.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Status)) return false;
        return this.equalKeys(other) && ((Status)other).equalKeys(this);
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
        i = getStatusCid();
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
        StringBuffer sb = new StringBuffer("[Status |");
        sb.append(" statusCid=").append(getStatusCid());
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
        ret.put("statusCid", Integer.valueOf(getStatusCid()));
        return ret;
    }

}
