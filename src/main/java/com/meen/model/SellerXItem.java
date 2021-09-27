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
@Table(name = "seller_x_item")
public class SellerXItem implements Serializable {

    /** Primary key. */
    protected static final String PK = "sellerXItemSid";

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
    @Column(name="seller_x_item_sid", unique=true, nullable=false)
    private int sellerXItemSid;
    @Column(name="category_x_items_cid", nullable=false)
    private int categoryXItemsCid;
    @Column(name="available_flag", nullable=false)
    private int availableFlag;
    @Column(name="discount_flag", length=45)
    private String discountFlag;
    @Column(name="discount_amount", length=45)
    private String discountAmount;
    @Column(length=45)
    private String stock;
    @Column(length=45)
    private String price;
    @Column(name="available_size", length=45)
    private String availableSize;
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

    /** Default constructor. */
    public SellerXItem() {
        super();
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
     * Access method for categoryXItemsCid.
     *
     * @return the current value of categoryXItemsCid
     */
    public int getCategoryXItemsCid() {
        return categoryXItemsCid;
    }

    /**
     * Setter method for categoryXItemsCid.
     *
     * @param aCategoryXItemsCid the new value for categoryXItemsCid
     */
    public void setCategoryXItemsCid(int aCategoryXItemsCid) {
        categoryXItemsCid = aCategoryXItemsCid;
    }

    /**
     * Access method for availableFlag.
     *
     * @return the current value of availableFlag
     */
    public int getAvailableFlag() {
        return availableFlag;
    }

    /**
     * Setter method for availableFlag.
     *
     * @param aAvailableFlag the new value for availableFlag
     */
    public void setAvailableFlag(int aAvailableFlag) {
        availableFlag = aAvailableFlag;
    }

    /**
     * Access method for discountFlag.
     *
     * @return the current value of discountFlag
     */
    public String getDiscountFlag() {
        return discountFlag;
    }

    /**
     * Setter method for discountFlag.
     *
     * @param aDiscountFlag the new value for discountFlag
     */
    public void setDiscountFlag(String aDiscountFlag) {
        discountFlag = aDiscountFlag;
    }

    /**
     * Access method for discountAmount.
     *
     * @return the current value of discountAmount
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter method for discountAmount.
     *
     * @param aDiscountAmount the new value for discountAmount
     */
    public void setDiscountAmount(String aDiscountAmount) {
        discountAmount = aDiscountAmount;
    }

    /**
     * Access method for stock.
     *
     * @return the current value of stock
     */
    public String getStock() {
        return stock;
    }

    /**
     * Setter method for stock.
     *
     * @param aStock the new value for stock
     */
    public void setStock(String aStock) {
        stock = aStock;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(String aPrice) {
        price = aPrice;
    }

    /**
     * Access method for availableSize.
     *
     * @return the current value of availableSize
     */
    public String getAvailableSize() {
        return availableSize;
    }

    /**
     * Setter method for availableSize.
     *
     * @param aAvailableSize the new value for availableSize
     */
    public void setAvailableSize(String aAvailableSize) {
        availableSize = aAvailableSize;
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
     * Compares the key for this instance with another SellerXItem.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SellerXItem and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SellerXItem)) {
            return false;
        }
        SellerXItem that = (SellerXItem) other;
        if (this.getSellerXItemSid() != that.getSellerXItemSid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SellerXItem.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SellerXItem)) return false;
        return this.equalKeys(other) && ((SellerXItem)other).equalKeys(this);
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
        i = getSellerXItemSid();
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
        StringBuffer sb = new StringBuffer("[SellerXItem |");
        sb.append(" sellerXItemSid=").append(getSellerXItemSid());
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
        ret.put("sellerXItemSid", Integer.valueOf(getSellerXItemSid()));
        return ret;
    }

	public String getUserSid() {
		return userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

}
