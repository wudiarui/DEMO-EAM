package com.magikey.common.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by dingyan on 15/9/2.
 */
@Entity
@Table(name = "tb_sys_user")
public class TbSysUserEntity extends BaseEntity {
    private Integer userId;
    private String realName;
    private String userDesc;
    private String userAge;
    private String userAddress;
//    private Timestamp createTime;
//    private Boolean deltag;
    private Collection<TbSysAccountEntity> tbSysAccountsByUserId;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "REAL_NAME", nullable = true, insertable = true, updatable = true, length = 45)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "USER_DESC", nullable = true, insertable = true, updatable = true, length = 45)
    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    @Basic
    @Column(name = "USER_AGE", nullable = true, insertable = true, updatable = true, length = 45)
    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "USER_ADDRESS", nullable = true, insertable = true, updatable = true, length = 45)
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

//    @Basic
//    @Column(name = "CREATE_TIME", nullable = true, insertable = true, updatable = true)
//    public Timestamp getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Timestamp createTime) {
//        this.createTime = createTime;
//    }
//
//    @Basic
//    @Column(name = "DELTAG", nullable = true, insertable = true, updatable = true)
//    public Boolean getDeltag() {
//        return deltag;
//    }
//
//    public void setDeltag(Boolean deltag) {
//        this.deltag = deltag;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSysUserEntity that = (TbSysUserEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (userDesc != null ? !userDesc.equals(that.userDesc) : that.userDesc != null) return false;
        if (userAge != null ? !userAge.equals(that.userAge) : that.userAge != null) return false;
        if (userAddress != null ? !userAddress.equals(that.userAddress) : that.userAddress != null) return false;
//        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
//        if (deltag != null ? !deltag.equals(that.deltag) : that.deltag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (userDesc != null ? userDesc.hashCode() : 0);
        result = 31 * result + (userAge != null ? userAge.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
//        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
//        result = 31 * result + (deltag != null ? deltag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tbSysUserByConnKeyUser")
    public Collection<TbSysAccountEntity> getTbSysAccountsByUserId() {
        return tbSysAccountsByUserId;
    }

    public void setTbSysAccountsByUserId(Collection<TbSysAccountEntity> tbSysAccountsByUserId) {
        this.tbSysAccountsByUserId = tbSysAccountsByUserId;
    }
}
