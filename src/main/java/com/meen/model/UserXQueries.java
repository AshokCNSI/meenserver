// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_x_queries")
public class UserXQueries implements Serializable {

    /** Primary key. */
    protected static final String PK = "userXQueriesSid";

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
    @Column(name="user_x_queries_sid", unique=true, nullable=false)
    private int userXQueriesSid;
    @Column(name="user_sid", length=45)
    private String userSid;
    @Column(name="query_title", length=45)
    private String queryTitle;
    @Column(name="query_subject", length=45)
    private String querySubject;
    @Column(name="query_desc", length=45)
    private String queryDesc;
    @Column(name="query_reply", length=45)
    private String queryReply;
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
    public UserXQueries() {
        super();
    }

    /**
     * Access method for userXQueriesSid.
     *
     * @return the current value of userXQueriesSid
     */
    public int getUserXQueriesSid() {
        return userXQueriesSid;
    }

    /**
     * Setter method for userXQueriesSid.
     *
     * @param aUserXQueriesSid the new value for userXQueriesSid
     */
    public void setUserXQueriesSid(int aUserXQueriesSid) {
        userXQueriesSid = aUserXQueriesSid;
    }

    /**
     * Access method for userSid.
     *
     * @return the current value of userSid
     */
    public String getUserSid() {
        return userSid;
    }

    /**
     * Setter method for userSid.
     *
     * @param aUserSid the new value for userSid
     */
    public void setUserSid(String aUserSid) {
        userSid = aUserSid;
    }

    /**
     * Access method for queryTitle.
     *
     * @return the current value of queryTitle
     */
    public String getQueryTitle() {
        return queryTitle;
    }

    /**
     * Setter method for queryTitle.
     *
     * @param aQueryTitle the new value for queryTitle
     */
    public void setQueryTitle(String aQueryTitle) {
        queryTitle = aQueryTitle;
    }

    /**
     * Access method for querySubject.
     *
     * @return the current value of querySubject
     */
    public String getQuerySubject() {
        return querySubject;
    }

    /**
     * Setter method for querySubject.
     *
     * @param aQuerySubject the new value for querySubject
     */
    public void setQuerySubject(String aQuerySubject) {
        querySubject = aQuerySubject;
    }

    /**
     * Access method for queryDesc.
     *
     * @return the current value of queryDesc
     */
    public String getQueryDesc() {
        return queryDesc;
    }

    /**
     * Setter method for queryDesc.
     *
     * @param aQueryDesc the new value for queryDesc
     */
    public void setQueryDesc(String aQueryDesc) {
        queryDesc = aQueryDesc;
    }

    /**
     * Access method for queryReply.
     *
     * @return the current value of queryReply
     */
    public String getQueryReply() {
        return queryReply;
    }

    /**
     * Setter method for queryReply.
     *
     * @param aQueryReply the new value for queryReply
     */
    public void setQueryReply(String aQueryReply) {
        queryReply = aQueryReply;
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
     * Compares the key for this instance with another UserXQueries.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserXQueries and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserXQueries)) {
            return false;
        }
        UserXQueries that = (UserXQueries) other;
        if (this.getUserXQueriesSid() != that.getUserXQueriesSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserXQueries.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserXQueries)) return false;
        return this.equalKeys(other) && ((UserXQueries)other).equalKeys(this);
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
        i = getUserXQueriesSid();
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
        StringBuffer sb = new StringBuffer("[UserXQueries |");
        sb.append(" userXQueriesSid=").append(getUserXQueriesSid());
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
        ret.put("userXQueriesSid", Integer.valueOf(getUserXQueriesSid()));
        return ret;
    }

}
