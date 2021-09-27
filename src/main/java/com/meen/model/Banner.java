// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Banner")
public class Banner implements Serializable {

    /** Primary key. */
    protected static final String PK = "bannerCid";

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
    @Column(name="banner_cid", unique=true, nullable=false)
    private int bannerCid;
    @Column(name="banner_title", length=45)
    private String bannerTitle;
    @Column(name="banner_name", length=45)
    private String bannerName;
    @Column(name="banner_desc", length=45)
    private String bannerDesc;
    @Column(name="banner_type", length=45)
    private String bannerType;
    @Column(name="banner_color", length=45)
    private String bannerColor;
    @Column(name="banner_bg_color", length=45)
    private String bannerBgColor;
    @Column(name="banner_image_path", length=45)
    private String bannerImagePath;
    @Column(name="banner_order", length=45)
    private String bannerOrder;
    @Column(name="banner_icon", length=45)
    private String bannerIcon;
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
    public Banner() {
        super();
    }

    /**
     * Access method for bannerCid.
     *
     * @return the current value of bannerCid
     */
    public int getBannerCid() {
        return bannerCid;
    }

    /**
     * Setter method for bannerCid.
     *
     * @param aBannerCid the new value for bannerCid
     */
    public void setBannerCid(int aBannerCid) {
        bannerCid = aBannerCid;
    }

    /**
     * Access method for bannerTitle.
     *
     * @return the current value of bannerTitle
     */
    public String getBannerTitle() {
        return bannerTitle;
    }

    /**
     * Setter method for bannerTitle.
     *
     * @param aBannerTitle the new value for bannerTitle
     */
    public void setBannerTitle(String aBannerTitle) {
        bannerTitle = aBannerTitle;
    }

    /**
     * Access method for bannerName.
     *
     * @return the current value of bannerName
     */
    public String getBannerName() {
        return bannerName;
    }

    /**
     * Setter method for bannerName.
     *
     * @param aBannerName the new value for bannerName
     */
    public void setBannerName(String aBannerName) {
        bannerName = aBannerName;
    }

    /**
     * Access method for bannerDesc.
     *
     * @return the current value of bannerDesc
     */
    public String getBannerDesc() {
        return bannerDesc;
    }

    /**
     * Setter method for bannerDesc.
     *
     * @param aBannerDesc the new value for bannerDesc
     */
    public void setBannerDesc(String aBannerDesc) {
        bannerDesc = aBannerDesc;
    }

    /**
     * Access method for bannerType.
     *
     * @return the current value of bannerType
     */
    public String getBannerType() {
        return bannerType;
    }

    /**
     * Setter method for bannerType.
     *
     * @param aBannerType the new value for bannerType
     */
    public void setBannerType(String aBannerType) {
        bannerType = aBannerType;
    }

    /**
     * Access method for bannerColor.
     *
     * @return the current value of bannerColor
     */
    public String getBannerColor() {
        return bannerColor;
    }

    /**
     * Setter method for bannerColor.
     *
     * @param aBannerColor the new value for bannerColor
     */
    public void setBannerColor(String aBannerColor) {
        bannerColor = aBannerColor;
    }

    /**
     * Access method for bannerBgColor.
     *
     * @return the current value of bannerBgColor
     */
    public String getBannerBgColor() {
        return bannerBgColor;
    }

    /**
     * Setter method for bannerBgColor.
     *
     * @param aBannerBgColor the new value for bannerBgColor
     */
    public void setBannerBgColor(String aBannerBgColor) {
        bannerBgColor = aBannerBgColor;
    }

    /**
     * Access method for bannerImagePath.
     *
     * @return the current value of bannerImagePath
     */
    public String getBannerImagePath() {
        return bannerImagePath;
    }

    /**
     * Setter method for bannerImagePath.
     *
     * @param aBannerImagePath the new value for bannerImagePath
     */
    public void setBannerImagePath(String aBannerImagePath) {
        bannerImagePath = aBannerImagePath;
    }

    /**
     * Access method for bannerOrder.
     *
     * @return the current value of bannerOrder
     */
    public String getBannerOrder() {
        return bannerOrder;
    }

    /**
     * Setter method for bannerOrder.
     *
     * @param aBannerOrder the new value for bannerOrder
     */
    public void setBannerOrder(String aBannerOrder) {
        bannerOrder = aBannerOrder;
    }

    /**
     * Access method for bannerIcon.
     *
     * @return the current value of bannerIcon
     */
    public String getBannerIcon() {
        return bannerIcon;
    }

    /**
     * Setter method for bannerIcon.
     *
     * @param aBannerIcon the new value for bannerIcon
     */
    public void setBannerIcon(String aBannerIcon) {
        bannerIcon = aBannerIcon;
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
     * Compares the key for this instance with another Banner.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Banner and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner that = (Banner) other;
        if (this.getBannerCid() != that.getBannerCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Banner.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Banner)) return false;
        return this.equalKeys(other) && ((Banner)other).equalKeys(this);
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
        i = getBannerCid();
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
        StringBuffer sb = new StringBuffer("[Banner |");
        sb.append(" bannerCid=").append(getBannerCid());
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
        ret.put("bannerCid", Integer.valueOf(getBannerCid()));
        return ret;
    }

}
