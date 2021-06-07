// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="item_piece_type")
public class ItemPieceType implements Serializable {

    /** Primary key. */
    protected static final String PK = "itemPieceTypeCid";

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
    @Column(name="item_piece_type_cid", unique=true, nullable=false)
    private int itemPieceTypeCid;
    @Column(name="item_piece_type_name", length=45)
    private String itemPieceTypeName;
    @Column(name="item_piece_type_desc", length=45)
    private String itemPieceTypeDesc;
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
    public ItemPieceType() {
        super();
    }

    /**
     * Access method for itemPieceTypeCid.
     *
     * @return the current value of itemPieceTypeCid
     */
    public int getItemPieceTypeCid() {
        return itemPieceTypeCid;
    }

    /**
     * Setter method for itemPieceTypeCid.
     *
     * @param aItemPieceTypeCid the new value for itemPieceTypeCid
     */
    public void setItemPieceTypeCid(int aItemPieceTypeCid) {
        itemPieceTypeCid = aItemPieceTypeCid;
    }

    /**
     * Access method for itemPieceTypeName.
     *
     * @return the current value of itemPieceTypeName
     */
    public String getItemPieceTypeName() {
        return itemPieceTypeName;
    }

    /**
     * Setter method for itemPieceTypeName.
     *
     * @param aItemPieceTypeName the new value for itemPieceTypeName
     */
    public void setItemPieceTypeName(String aItemPieceTypeName) {
        itemPieceTypeName = aItemPieceTypeName;
    }

    /**
     * Access method for itemPieceTypeDesc.
     *
     * @return the current value of itemPieceTypeDesc
     */
    public String getItemPieceTypeDesc() {
        return itemPieceTypeDesc;
    }

    /**
     * Setter method for itemPieceTypeDesc.
     *
     * @param aItemPieceTypeDesc the new value for itemPieceTypeDesc
     */
    public void setItemPieceTypeDesc(String aItemPieceTypeDesc) {
        itemPieceTypeDesc = aItemPieceTypeDesc;
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
     * Compares the key for this instance with another ItemPieceType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ItemPieceType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ItemPieceType)) {
            return false;
        }
        ItemPieceType that = (ItemPieceType) other;
        if (this.getItemPieceTypeCid() != that.getItemPieceTypeCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ItemPieceType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ItemPieceType)) return false;
        return this.equalKeys(other) && ((ItemPieceType)other).equalKeys(this);
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
        i = getItemPieceTypeCid();
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
        StringBuffer sb = new StringBuffer("[ItemPieceType |");
        sb.append(" itemPieceTypeCid=").append(getItemPieceTypeCid());
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
        ret.put("itemPieceTypeCid", Integer.valueOf(getItemPieceTypeCid()));
        return ret;
    }

}
