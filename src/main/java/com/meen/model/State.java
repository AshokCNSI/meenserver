// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="State")
public class State implements Serializable {

    /** Primary key. */
    protected static final String PK = "stateCid";

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
    @Column(name="state_cid", unique=true, nullable=false)
    private int stateCid;
    @Column(name="state_name", length=45)
    private String stateName;
    @Column(name="state_desc", length=45)
    private String stateDesc;
    @Column(name="created_date", length=45)
    private String createdDate;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="state_code", length=45)
    private String stateCode;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public State() {
        super();
    }

    /**
     * Access method for stateCid.
     *
     * @return the current value of stateCid
     */
    public int getStateCid() {
        return stateCid;
    }

    /**
     * Setter method for stateCid.
     *
     * @param aStateCid the new value for stateCid
     */
    public void setStateCid(int aStateCid) {
        stateCid = aStateCid;
    }

    /**
     * Access method for stateName.
     *
     * @return the current value of stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Setter method for stateName.
     *
     * @param aStateName the new value for stateName
     */
    public void setStateName(String aStateName) {
        stateName = aStateName;
    }

    /**
     * Access method for stateDesc.
     *
     * @return the current value of stateDesc
     */
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * Setter method for stateDesc.
     *
     * @param aStateDesc the new value for stateDesc
     */
    public void setStateDesc(String aStateDesc) {
        stateDesc = aStateDesc;
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
     * Access method for stateCode.
     *
     * @return the current value of stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Setter method for stateCode.
     *
     * @param aStateCode the new value for stateCode
     */
    public void setStateCode(String aStateCode) {
        stateCode = aStateCode;
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
     * Compares the key for this instance with another State.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class State and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State that = (State) other;
        if (this.getStateCid() != that.getStateCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another State.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof State)) return false;
        return this.equalKeys(other) && ((State)other).equalKeys(this);
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
        i = getStateCid();
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
        StringBuffer sb = new StringBuffer("[State |");
        sb.append(" stateCid=").append(getStateCid());
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
        ret.put("stateCid", Integer.valueOf(getStateCid()));
        return ret;
    }

}
