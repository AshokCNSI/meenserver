// Generated with g9.

package com.meen.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="role_x_menu")
public class RoleXMenu implements Serializable {

    /** Primary key. */
    protected static final String PK = "roleXMenuCid";

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
    @Column(name="role_x_menu_cid", unique=true, nullable=false)
    private int roleXMenuCid;
    @Column(name="role_cid", length=45)
    private String roleCid;
    @Column(name="menu_cid", length=45)
    private String menuCid;
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
    @Column(name="menu_icon", length=45)
    private String menuIcon;
    @Column(name="menu_path", length=45)
    private String menuPath;
    @Column(name="menu_order", length=45)
    private String menuOrder;

    /** Default constructor. */
    public RoleXMenu() {
        super();
    }

    /**
     * Access method for roleXMenuCid.
     *
     * @return the current value of roleXMenuCid
     */
    public int getRoleXMenuCid() {
        return roleXMenuCid;
    }

    /**
     * Setter method for roleXMenuCid.
     *
     * @param aRoleXMenuCid the new value for roleXMenuCid
     */
    public void setRoleXMenuCid(int aRoleXMenuCid) {
        roleXMenuCid = aRoleXMenuCid;
    }

    /**
     * Access method for roleCid.
     *
     * @return the current value of roleCid
     */
    public String getRoleCid() {
        return roleCid;
    }

    /**
     * Setter method for roleCid.
     *
     * @param aRoleCid the new value for roleCid
     */
    public void setRoleCid(String aRoleCid) {
        roleCid = aRoleCid;
    }

    /**
     * Access method for menuCid.
     *
     * @return the current value of menuCid
     */
    public String getMenuCid() {
        return menuCid;
    }

    /**
     * Setter method for menuCid.
     *
     * @param aMenuCid the new value for menuCid
     */
    public void setMenuCid(String aMenuCid) {
        menuCid = aMenuCid;
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
     * Access method for menuIcon.
     *
     * @return the current value of menuIcon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * Setter method for menuIcon.
     *
     * @param aMenuIcon the new value for menuIcon
     */
    public void setMenuIcon(String aMenuIcon) {
        menuIcon = aMenuIcon;
    }

    /**
     * Access method for menuPath.
     *
     * @return the current value of menuPath
     */
    public String getMenuPath() {
        return menuPath;
    }

    /**
     * Setter method for menuPath.
     *
     * @param aMenuPath the new value for menuPath
     */
    public void setMenuPath(String aMenuPath) {
        menuPath = aMenuPath;
    }

    /**
     * Access method for menuOrder.
     *
     * @return the current value of menuOrder
     */
    public String getMenuOrder() {
        return menuOrder;
    }

    /**
     * Setter method for menuOrder.
     *
     * @param aMenuOrder the new value for menuOrder
     */
    public void setMenuOrder(String aMenuOrder) {
        menuOrder = aMenuOrder;
    }

    /**
     * Compares the key for this instance with another RoleXMenu.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RoleXMenu and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RoleXMenu)) {
            return false;
        }
        RoleXMenu that = (RoleXMenu) other;
        if (this.getRoleXMenuCid() != that.getRoleXMenuCid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RoleXMenu.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RoleXMenu)) return false;
        return this.equalKeys(other) && ((RoleXMenu)other).equalKeys(this);
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
        i = getRoleXMenuCid();
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
        StringBuffer sb = new StringBuffer("[RoleXMenu |");
        sb.append(" roleXMenuCid=").append(getRoleXMenuCid());
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
        ret.put("roleXMenuCid", Integer.valueOf(getRoleXMenuCid()));
        return ret;
    }

}
