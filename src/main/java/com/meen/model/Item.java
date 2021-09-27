// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Item")
public class Item implements Serializable {

    /** Primary key. */
    protected static final String PK = "itemCid";

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
    @Column(name="item_cid", unique=true, nullable=false)
    private int itemCid;
    @Column(name="item_name", length=45)
    private String itemName;
    @Column(name="item_desc", length=45)
    private String itemDesc;
    @Column(name="created_date", length=45)
    private String createdDate;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="item_code", length=45)
    private String itemCode;
    @Column(name="item_image_path", length=45)
    private String itemImagePath;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public Item() {
        super();
    }

    /**
     * Access method for itemCid.
     *
     * @return the current value of itemCid
     */
    public int getItemCid() {
        return itemCid;
    }

    /**
     * Setter method for itemCid.
     *
     * @param aItemCid the new value for itemCid
     */
    public void setItemCid(int aItemCid) {
        itemCid = aItemCid;
    }

    /**
     * Access method for itemName.
     *
     * @return the current value of itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Setter method for itemName.
     *
     * @param aItemName the new value for itemName
     */
    public void setItemName(String aItemName) {
        itemName = aItemName;
    }

    /**
     * Access method for itemDesc.
     *
     * @return the current value of itemDesc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Setter method for itemDesc.
     *
     * @param aItemDesc the new value for itemDesc
     */
    public void setItemDesc(String aItemDesc) {
        itemDesc = aItemDesc;
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
     * Access method for itemCode.
     *
     * @return the current value of itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Setter method for itemCode.
     *
     * @param aItemCode the new value for itemCode
     */
    public void setItemCode(String aItemCode) {
        itemCode = aItemCode;
    }

    /**
     * Access method for itemImagePath.
     *
     * @return the current value of itemImagePath
     */
    public String getItemImagePath() {
        return itemImagePath;
    }

    /**
     * Setter method for itemImagePath.
     *
     * @param aItemImagePath the new value for itemImagePath
     */
    public void setItemImagePath(String aItemImagePath) {
        itemImagePath = aItemImagePath;
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
     * Compares the key for this instance with another Item.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Item and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item that = (Item) other;
        if (this.getItemCid() != that.getItemCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Item.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Item)) return false;
        return this.equalKeys(other) && ((Item)other).equalKeys(this);
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
        i = getItemCid();
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
        StringBuffer sb = new StringBuffer("[Item |");
        sb.append(" itemCid=").append(getItemCid());
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
        ret.put("itemCid", Integer.valueOf(getItemCid()));
        return ret;
    }

}
