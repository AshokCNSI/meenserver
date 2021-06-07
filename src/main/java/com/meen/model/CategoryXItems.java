// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="category_x_items")
public class CategoryXItems implements Serializable {

    /** Primary key. */
    protected static final String PK = "categoryXItemsCid";

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
    @Column(name="category_x_items_cid", unique=true, nullable=false)
    private int categoryXItemsCid;
    @Column(name="category_cid", length=45)
    private String categoryCid;
    @Column(name="item_cid", length=45)
    private String itemCid;
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
    public CategoryXItems() {
        super();
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
     * Access method for categoryCid.
     *
     * @return the current value of categoryCid
     */
    public String getCategoryCid() {
        return categoryCid;
    }

    /**
     * Setter method for categoryCid.
     *
     * @param aCategoryCid the new value for categoryCid
     */
    public void setCategoryCid(String aCategoryCid) {
        categoryCid = aCategoryCid;
    }

    /**
     * Access method for itemCid.
     *
     * @return the current value of itemCid
     */
    public String getItemCid() {
        return itemCid;
    }

    /**
     * Setter method for itemCid.
     *
     * @param aItemCid the new value for itemCid
     */
    public void setItemCid(String aItemCid) {
        itemCid = aItemCid;
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
     * Compares the key for this instance with another CategoryXItems.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CategoryXItems and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CategoryXItems)) {
            return false;
        }
        CategoryXItems that = (CategoryXItems) other;
        if (this.getCategoryXItemsCid() != that.getCategoryXItemsCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CategoryXItems.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CategoryXItems)) return false;
        return this.equalKeys(other) && ((CategoryXItems)other).equalKeys(this);
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
        i = getCategoryXItemsCid();
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
        StringBuffer sb = new StringBuffer("[CategoryXItems |");
        sb.append(" categoryXItemsCid=").append(getCategoryXItemsCid());
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
        ret.put("categoryXItemsCid", Integer.valueOf(getCategoryXItemsCid()));
        return ret;
    }

}
