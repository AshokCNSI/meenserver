// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="orders")
public class Orders implements Serializable {

    /** Primary key. */
    protected static final String PK = "orderSid";

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
    @Column(name="order_sid", unique=true, nullable=false)
    private int orderSid;
    @Column(name="order_ref_number", nullable=false)
    private int orderRefNumber;
    @Column(name="seller_sid", length=45)
    private String sellerSid;
    @Column(name="deliverer_sid", length=45)
    private String delivererSid;
    @Column(name="user_x_address_book_sid", length=45)
    private String userXAddressBookSid;
    @Column(name="user_sid", length=45)
    private String userSid;
    @Column(name="status_cid", length=45)
    private String statusCid;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;
    @Column(name="masala_lkp_sid", length=45)
    private String masalaLkpSid;
    @Column(name="masala_quantity", length=45)
    private String masalaQuantity;
    @Column(name="delivery_charge_lkp_sid", length=45)
    private String deliveryChargeLkpSid;
    @Column(length=45)
    private String rating;

    /** Default constructor. */
    public Orders() {
        super();
    }

    /**
     * Access method for orderSid.
     *
     * @return the current value of orderSid
     */
    public int getOrderSid() {
        return orderSid;
    }

    /**
     * Setter method for orderSid.
     *
     * @param aOrderSid the new value for orderSid
     */
    public void setOrderSid(int aOrderSid) {
        orderSid = aOrderSid;
    }

    /**
     * Access method for orderRefNumber.
     *
     * @return the current value of orderRefNumber
     */
    public int getOrderRefNumber() {
        return orderRefNumber;
    }

    /**
     * Setter method for orderRefNumber.
     *
     * @param aOrderRefNumber the new value for orderRefNumber
     */
    public void setOrderRefNumber(int aOrderRefNumber) {
        orderRefNumber = aOrderRefNumber;
    }

    /**
     * Access method for sellerSid.
     *
     * @return the current value of sellerSid
     */
    public String getSellerSid() {
        return sellerSid;
    }

    /**
     * Setter method for sellerSid.
     *
     * @param aSellerSid the new value for sellerSid
     */
    public void setSellerSid(String aSellerSid) {
        sellerSid = aSellerSid;
    }

    /**
     * Access method for delivererSid.
     *
     * @return the current value of delivererSid
     */
    public String getDelivererSid() {
        return delivererSid;
    }

    /**
     * Setter method for delivererSid.
     *
     * @param aDelivererSid the new value for delivererSid
     */
    public void setDelivererSid(String aDelivererSid) {
        delivererSid = aDelivererSid;
    }

    /**
     * Access method for userXAddressBookSid.
     *
     * @return the current value of userXAddressBookSid
     */
    public String getUserXAddressBookSid() {
        return userXAddressBookSid;
    }

    /**
     * Setter method for userXAddressBookSid.
     *
     * @param aUserXAddressBookSid the new value for userXAddressBookSid
     */
    public void setUserXAddressBookSid(String aUserXAddressBookSid) {
        userXAddressBookSid = aUserXAddressBookSid;
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
     * Access method for statusCid.
     *
     * @return the current value of statusCid
     */
    public String getStatusCid() {
        return statusCid;
    }

    /**
     * Setter method for statusCid.
     *
     * @param aStatusCid the new value for statusCid
     */
    public void setStatusCid(String aStatusCid) {
        statusCid = aStatusCid;
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
     * Access method for masalaLkpSid.
     *
     * @return the current value of masalaLkpSid
     */
    public String getMasalaLkpSid() {
        return masalaLkpSid;
    }

    /**
     * Setter method for masalaLkpSid.
     *
     * @param aMasalaLkpSid the new value for masalaLkpSid
     */
    public void setMasalaLkpSid(String aMasalaLkpSid) {
        masalaLkpSid = aMasalaLkpSid;
    }

    /**
     * Access method for masalaQuantity.
     *
     * @return the current value of masalaQuantity
     */
    public String getMasalaQuantity() {
        return masalaQuantity;
    }

    /**
     * Setter method for masalaQuantity.
     *
     * @param aMasalaQuantity the new value for masalaQuantity
     */
    public void setMasalaQuantity(String aMasalaQuantity) {
        masalaQuantity = aMasalaQuantity;
    }

    /**
     * Access method for deliveryChargeLkpSid.
     *
     * @return the current value of deliveryChargeLkpSid
     */
    public String getDeliveryChargeLkpSid() {
        return deliveryChargeLkpSid;
    }

    /**
     * Setter method for deliveryChargeLkpSid.
     *
     * @param aDeliveryChargeLkpSid the new value for deliveryChargeLkpSid
     */
    public void setDeliveryChargeLkpSid(String aDeliveryChargeLkpSid) {
        deliveryChargeLkpSid = aDeliveryChargeLkpSid;
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
     * Compares the key for this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Orders and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Orders)) {
            return false;
        }
        Orders that = (Orders) other;
        if (this.getOrderSid() != that.getOrderSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Orders.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Orders)) return false;
        return this.equalKeys(other) && ((Orders)other).equalKeys(this);
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
        i = getOrderSid();
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
        StringBuffer sb = new StringBuffer("[Orders |");
        sb.append(" orderSid=").append(getOrderSid());
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
        ret.put("orderSid", Integer.valueOf(getOrderSid()));
        return ret;
    }

}
