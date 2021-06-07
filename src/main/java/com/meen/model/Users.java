// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="users")
public class Users implements Serializable {

    /** Primary key. */
    protected static final String PK = "userSid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private String lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public String getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(String aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="user_sid", unique=true, nullable=false)
    private String userSid;
    @Column(name="user_role_type", nullable=false)
    private int userRoleType;
    @Column(nullable=false)
    private int email;
    @Column(name="first_name", nullable=false)
    private int firstName;
    @Column(name="last_name", length=45)
    private String lastName;
    @Column(name="mobile_number", length=45)
    private String mobileNumber;
    @Column(name="street_1", length=45)
    private String street1;
    @Column(name="street_2", length=45)
    private String street2;
    @Column(length=45)
    private String pincode;
    @Column(name="state_cid", length=45)
    private String stateCid;
    @Column(name="district_cid", length=45)
    private String districtCid;
    @Column(name="suspended_flag", length=45)
    private String suspendedFlag;
    @Column(name="opening_time", length=45)
    private String openingTime;
    @Column(name="closing_time", length=45)
    private String closingTime;
    @Column(name="org_name", length=45)
    private String orgName;
    @Column(name="org_latitude", length=45)
    private String orgLatitude;
    @Column(name="org_longitude", length=45)
    private String orgLongitude;
    @Column(length=45)
    private String rating;
    @Column(name="available_days", length=45)
    private String availableDays;
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
    public Users() {
        super();
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
     * Access method for userRoleType.
     *
     * @return the current value of userRoleType
     */
    public int getUserRoleType() {
        return userRoleType;
    }

    /**
     * Setter method for userRoleType.
     *
     * @param aUserRoleType the new value for userRoleType
     */
    public void setUserRoleType(int aUserRoleType) {
        userRoleType = aUserRoleType;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public int getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(int aEmail) {
        email = aEmail;
    }

    /**
     * Access method for firstName.
     *
     * @return the current value of firstName
     */
    public int getFirstName() {
        return firstName;
    }

    /**
     * Setter method for firstName.
     *
     * @param aFirstName the new value for firstName
     */
    public void setFirstName(int aFirstName) {
        firstName = aFirstName;
    }

    /**
     * Access method for lastName.
     *
     * @return the current value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for lastName.
     *
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for mobileNumber.
     *
     * @return the current value of mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Setter method for mobileNumber.
     *
     * @param aMobileNumber the new value for mobileNumber
     */
    public void setMobileNumber(String aMobileNumber) {
        mobileNumber = aMobileNumber;
    }

    /**
     * Access method for street1.
     *
     * @return the current value of street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Setter method for street1.
     *
     * @param aStreet1 the new value for street1
     */
    public void setStreet1(String aStreet1) {
        street1 = aStreet1;
    }

    /**
     * Access method for street2.
     *
     * @return the current value of street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Setter method for street2.
     *
     * @param aStreet2 the new value for street2
     */
    public void setStreet2(String aStreet2) {
        street2 = aStreet2;
    }

    /**
     * Access method for pincode.
     *
     * @return the current value of pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Setter method for pincode.
     *
     * @param aPincode the new value for pincode
     */
    public void setPincode(String aPincode) {
        pincode = aPincode;
    }

    /**
     * Access method for stateCid.
     *
     * @return the current value of stateCid
     */
    public String getStateCid() {
        return stateCid;
    }

    /**
     * Setter method for stateCid.
     *
     * @param aStateCid the new value for stateCid
     */
    public void setStateCid(String aStateCid) {
        stateCid = aStateCid;
    }

    /**
     * Access method for districtCid.
     *
     * @return the current value of districtCid
     */
    public String getDistrictCid() {
        return districtCid;
    }

    /**
     * Setter method for districtCid.
     *
     * @param aDistrictCid the new value for districtCid
     */
    public void setDistrictCid(String aDistrictCid) {
        districtCid = aDistrictCid;
    }

    /**
     * Access method for suspendedFlag.
     *
     * @return the current value of suspendedFlag
     */
    public String getSuspendedFlag() {
        return suspendedFlag;
    }

    /**
     * Setter method for suspendedFlag.
     *
     * @param aSuspendedFlag the new value for suspendedFlag
     */
    public void setSuspendedFlag(String aSuspendedFlag) {
        suspendedFlag = aSuspendedFlag;
    }

    /**
     * Access method for openingTime.
     *
     * @return the current value of openingTime
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * Setter method for openingTime.
     *
     * @param aOpeningTime the new value for openingTime
     */
    public void setOpeningTime(String aOpeningTime) {
        openingTime = aOpeningTime;
    }

    /**
     * Access method for closingTime.
     *
     * @return the current value of closingTime
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Setter method for closingTime.
     *
     * @param aClosingTime the new value for closingTime
     */
    public void setClosingTime(String aClosingTime) {
        closingTime = aClosingTime;
    }

    /**
     * Access method for orgName.
     *
     * @return the current value of orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Setter method for orgName.
     *
     * @param aOrgName the new value for orgName
     */
    public void setOrgName(String aOrgName) {
        orgName = aOrgName;
    }

    /**
     * Access method for orgLatitude.
     *
     * @return the current value of orgLatitude
     */
    public String getOrgLatitude() {
        return orgLatitude;
    }

    /**
     * Setter method for orgLatitude.
     *
     * @param aOrgLatitude the new value for orgLatitude
     */
    public void setOrgLatitude(String aOrgLatitude) {
        orgLatitude = aOrgLatitude;
    }

    /**
     * Access method for orgLongitude.
     *
     * @return the current value of orgLongitude
     */
    public String getOrgLongitude() {
        return orgLongitude;
    }

    /**
     * Setter method for orgLongitude.
     *
     * @param aOrgLongitude the new value for orgLongitude
     */
    public void setOrgLongitude(String aOrgLongitude) {
        orgLongitude = aOrgLongitude;
    }

    /**
     * Access method for rating.
     *
     * @return the current value of rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Setter method for rating.
     *
     * @param aRating the new value for rating
     */
    public void setRating(String aRating) {
        rating = aRating;
    }

    /**
     * Access method for availableDays.
     *
     * @return the current value of availableDays
     */
    public String getAvailableDays() {
        return availableDays;
    }

    /**
     * Setter method for availableDays.
     *
     * @param aAvailableDays the new value for availableDays
     */
    public void setAvailableDays(String aAvailableDays) {
        availableDays = aAvailableDays;
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
     * Compares the key for this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Users and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Users)) {
            return false;
        }
        Users that = (Users) other;
        if (this.getUserSid() != that.getUserSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Users)) return false;
        return this.equalKeys(other) && ((Users)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
   
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Users |");
        sb.append(" userSid=").append(getUserSid());
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
        ret.put("userSid", Integer.valueOf(getUserSid()));
        return ret;
    }

}
