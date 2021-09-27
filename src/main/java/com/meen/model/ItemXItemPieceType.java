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
@Table(name = "item_x_item_piece_type")
public class ItemXItemPieceType implements Serializable {

    /** Primary key. */
    protected static final String PK = "itemXItemPieceTypeCid";

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
    @Column(name="item_x_item_piece_type_cid", unique=true, nullable=false)
    private int itemXItemPieceTypeCid;
    @Column(name="item_cid", length=45)
    private String itemCid;
    @Column(name="item_piece_type_cid", length=45)
    private String itemPieceTypeCid;
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
    public ItemXItemPieceType() {
        super();
    }

    /**
     * Access method for itemXItemPieceTypeCid.
     *
     * @return the current value of itemXItemPieceTypeCid
     */
    public int getItemXItemPieceTypeCid() {
        return itemXItemPieceTypeCid;
    }

    /**
     * Setter method for itemXItemPieceTypeCid.
     *
     * @param aItemXItemPieceTypeCid the new value for itemXItemPieceTypeCid
     */
    public void setItemXItemPieceTypeCid(int aItemXItemPieceTypeCid) {
        itemXItemPieceTypeCid = aItemXItemPieceTypeCid;
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
     * Access method for itemPieceTypeCid.
     *
     * @return the current value of itemPieceTypeCid
     */
    public String getItemPieceTypeCid() {
        return itemPieceTypeCid;
    }

    /**
     * Setter method for itemPieceTypeCid.
     *
     * @param aItemPieceTypeCid the new value for itemPieceTypeCid
     */
    public void setItemPieceTypeCid(String aItemPieceTypeCid) {
        itemPieceTypeCid = aItemPieceTypeCid;
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
     * Compares the key for this instance with another ItemXItemPieceType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ItemXItemPieceType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ItemXItemPieceType)) {
            return false;
        }
        ItemXItemPieceType that = (ItemXItemPieceType) other;
        if (this.getItemXItemPieceTypeCid() != that.getItemXItemPieceTypeCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ItemXItemPieceType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ItemXItemPieceType)) return false;
        return this.equalKeys(other) && ((ItemXItemPieceType)other).equalKeys(this);
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
        i = getItemXItemPieceTypeCid();
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
        StringBuffer sb = new StringBuffer("[ItemXItemPieceType |");
        sb.append(" itemXItemPieceTypeCid=").append(getItemXItemPieceTypeCid());
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
        ret.put("itemXItemPieceTypeCid", Integer.valueOf(getItemXItemPieceTypeCid()));
        return ret;
    }

}
