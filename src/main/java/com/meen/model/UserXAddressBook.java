// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="user_x_address_book")
public class UserXAddressBook implements Serializable {

    /** Primary key. */
    protected static final String PK = "userXAddressBookSid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
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
    @Column(name="user_x_address_book_sid", unique=true, nullable=false)
    private int userXAddressBookSid;
    @Column(name="street_1", length=45)
    private String street1;
    @Column(name="street_2", length=45)
    private String street2;
    @Column(length=45)
    private String landmark;
    @Column(length=45)
    private String latitude;
    @Column(length=45)
    private String longitude;
    @Column(name="customer_name", length=45)
    private String customerName;
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
    @Column(name="user_sid", length=45)
    private String userSid;
    @Column(name="mobile_numer", length=45)
    private String mobileNumer;
    @Column(length=45)
    private String pincode;

    /** Default constructor. */
    public UserXAddressBook() {
        super();
    }

    /**
     * Access method for userXAddressBookSid.
     *
     * @return the current value of userXAddressBookSid
     */
    public int getUserXAddressBookSid() {
        return userXAddressBookSid;
    }

    /**
     * Setter method for userXAddressBookSid.
     *
     * @param aUserXAddressBookSid the new value for userXAddressBookSid
     */
    public void setUserXAddressBookSid(int aUserXAddressBookSid) {
        userXAddressBookSid = aUserXAddressBookSid;
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
     * Access method for landmark.
     *
     * @return the current value of landmark
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * Setter method for landmark.
     *
     * @param aLandmark the new value for landmark
     */
    public void setLandmark(String aLandmark) {
        landmark = aLandmark;
    }

    /**
     * Access method for latitude.
     *
     * @return the current value of latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Setter method for latitude.
     *
     * @param aLatitude the new value for latitude
     */
    public void setLatitude(String aLatitude) {
        latitude = aLatitude;
    }

    /**
     * Access method for longitude.
     *
     * @return the current value of longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Setter method for longitude.
     *
     * @param aLongitude the new value for longitude
     */
    public void setLongitude(String aLongitude) {
        longitude = aLongitude;
    }

    /**
     * Access method for customerName.
     *
     * @return the current value of customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter method for customerName.
     *
     * @param aCustomerName the new value for customerName
     */
    public void setCustomerName(String aCustomerName) {
        customerName = aCustomerName;
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
     * Access method for mobileNumer.
     *
     * @return the current value of mobileNumer
     */
    public String getMobileNumer() {
        return mobileNumer;
    }

    /**
     * Setter method for mobileNumer.
     *
     * @param aMobileNumer the new value for mobileNumer
     */
    public void setMobileNumer(String aMobileNumer) {
        mobileNumer = aMobileNumer;
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
     * Compares the key for this instance with another UserXAddressBook.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserXAddressBook and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserXAddressBook)) {
            return false;
        }
        UserXAddressBook that = (UserXAddressBook) other;
        if (this.getUserXAddressBookSid() != that.getUserXAddressBookSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserXAddressBook.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserXAddressBook)) return false;
        return this.equalKeys(other) && ((UserXAddressBook)other).equalKeys(this);
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
        i = getUserXAddressBookSid();
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
        StringBuffer sb = new StringBuffer("[UserXAddressBook |");
        sb.append(" userXAddressBookSid=").append(getUserXAddressBookSid());
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
        ret.put("userXAddressBookSid", Integer.valueOf(getUserXAddressBookSid()));
        return ret;
    }

}
