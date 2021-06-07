// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="order_x_item")
public class OrderXItem implements Serializable {

    /** Primary key. */
    protected static final String PK = "orderXItemSid";

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
    @Column(name="order_x_item_sid", unique=true, nullable=false)
    private int orderXItemSid;
    @Column(name="order_sid", nullable=false)
    private int orderSid;
    @Column(name="seller_x_item_sid", nullable=false)
    private int sellerXItemSid;
    @Column(name="item_quantity", length=45)
    private String itemQuantity;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public OrderXItem() {
        super();
    }

    /**
     * Access method for orderXItemSid.
     *
     * @return the current value of orderXItemSid
     */
    public int getOrderXItemSid() {
        return orderXItemSid;
    }

    /**
     * Setter method for orderXItemSid.
     *
     * @param aOrderXItemSid the new value for orderXItemSid
     */
    public void setOrderXItemSid(int aOrderXItemSid) {
        orderXItemSid = aOrderXItemSid;
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
     * Access method for sellerXItemSid.
     *
     * @return the current value of sellerXItemSid
     */
    public int getSellerXItemSid() {
        return sellerXItemSid;
    }

    /**
     * Setter method for sellerXItemSid.
     *
     * @param aSellerXItemSid the new value for sellerXItemSid
     */
    public void setSellerXItemSid(int aSellerXItemSid) {
        sellerXItemSid = aSellerXItemSid;
    }

    /**
     * Access method for itemQuantity.
     *
     * @return the current value of itemQuantity
     */
    public String getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Setter method for itemQuantity.
     *
     * @param aItemQuantity the new value for itemQuantity
     */
    public void setItemQuantity(String aItemQuantity) {
        itemQuantity = aItemQuantity;
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
     * Compares the key for this instance with another OrderXItem.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderXItem and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderXItem)) {
            return false;
        }
        OrderXItem that = (OrderXItem) other;
        if (this.getOrderXItemSid() != that.getOrderXItemSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderXItem.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderXItem)) return false;
        return this.equalKeys(other) && ((OrderXItem)other).equalKeys(this);
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
        i = getOrderXItemSid();
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
        StringBuffer sb = new StringBuffer("[OrderXItem |");
        sb.append(" orderXItemSid=").append(getOrderXItemSid());
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
        ret.put("orderXItemSid", Integer.valueOf(getOrderXItemSid()));
        return ret;
    }

}
