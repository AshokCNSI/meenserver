// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="category")
public class Category implements Serializable {

    /** Primary key. */
    protected static final String PK = "catergoryCid";

    @Id
    @Column(name="catergory_cid", unique=true, nullable=false)
    private int catergoryCid;
    @Column(name="category_name", length=45)
    private String categoryName;
    @Column(name="category_desc", length=45)
    private String categoryDesc;
    @Column(name="created_date", length=45)
    private String createdDate;
    @Column(name="created_by", length=45)
    private String createdBy;
    @Column(name="modified_date", length=45)
    private String modifiedDate;
    @Column(name="modified_by", length=45)
    private String modifiedBy;
    @Column(name="category_code", length=45)
    private String categoryCode;
    @Column(name="oprtln_flag", length=45)
    private String oprtlnFlag;

    /** Default constructor. */
    public Category() {
        super();
    }

    /**
     * Access method for catergoryCid.
     *
     * @return the current value of catergoryCid
     */
    public int getCatergoryCid() {
        return catergoryCid;
    }

    /**
     * Setter method for catergoryCid.
     *
     * @param aCatergoryCid the new value for catergoryCid
     */
    public void setCatergoryCid(int aCatergoryCid) {
        catergoryCid = aCatergoryCid;
    }

    /**
     * Access method for categoryName.
     *
     * @return the current value of categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Setter method for categoryName.
     *
     * @param aCategoryName the new value for categoryName
     */
    public void setCategoryName(String aCategoryName) {
        categoryName = aCategoryName;
    }

    /**
     * Access method for categoryDesc.
     *
     * @return the current value of categoryDesc
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * Setter method for categoryDesc.
     *
     * @param aCategoryDesc the new value for categoryDesc
     */
    public void setCategoryDesc(String aCategoryDesc) {
        categoryDesc = aCategoryDesc;
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
     * Access method for categoryCode.
     *
     * @return the current value of categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Setter method for categoryCode.
     *
     * @param aCategoryCode the new value for categoryCode
     */
    public void setCategoryCode(String aCategoryCode) {
        categoryCode = aCategoryCode;
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
     * Compares the key for this instance with another Category.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Category and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category that = (Category) other;
        if (this.getCatergoryCid() != that.getCatergoryCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Category.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Category)) return false;
        return this.equalKeys(other) && ((Category)other).equalKeys(this);
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
        i = getCatergoryCid();
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
        StringBuffer sb = new StringBuffer("[Category |");
        sb.append(" catergoryCid=").append(getCatergoryCid());
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
        ret.put("catergoryCid", Integer.valueOf(getCatergoryCid()));
        return ret;
    }

}
