package com.magikey.common.entity;

import javax.persistence.*;

/**
 * Created by dingyan on 15/9/2.
 */
@Entity
@Table(name = "tb_sys_account")
public class TbSysAccountEntity extends BaseEntity {
    private Integer accountId;
    private String accountName;
    private String accountDesc;
//    private Timestamp createTime;
//    private Boolean deltag;
    private String accountPassword;
    private Boolean locktag;
    private TbSysUserEntity tbSysUserByConnKeyUser;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID", nullable = false, insertable = true, updatable = true)
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "ACCOUNT_NAME", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "ACCOUNT_DESC", nullable = true, insertable = true, updatable = true, length = 100)
    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
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

    @Basic
    @Column(name = "ACCOUNT_PASSWORD", nullable = true, insertable = true, updatable = true, length = 64)
    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Basic
    @Column(name = "LOCKTAG", nullable = true, insertable = true, updatable = true)
    public Boolean getLocktag() {
        return locktag;
    }

    public void setLocktag(Boolean locktag) {
        this.locktag = locktag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSysAccountEntity that = (TbSysAccountEntity) o;

        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (accountName != null ? !accountName.equals(that.accountName) : that.accountName != null) return false;
        if (accountDesc != null ? !accountDesc.equals(that.accountDesc) : that.accountDesc != null) return false;
//        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
//        if (deltag != null ? !deltag.equals(that.deltag) : that.deltag != null) return false;
        if (accountPassword != null ? !accountPassword.equals(that.accountPassword) : that.accountPassword != null)
            return false;
        if (locktag != null ? !locktag.equals(that.locktag) : that.locktag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (accountDesc != null ? accountDesc.hashCode() : 0);
//        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
//        result = 31 * result + (deltag != null ? deltag.hashCode() : 0);
        result = 31 * result + (accountPassword != null ? accountPassword.hashCode() : 0);
        result = 31 * result + (locktag != null ? locktag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CONN_KEY_USER", referencedColumnName = "USER_ID")
    public TbSysUserEntity getTbSysUserByConnKeyUser() {
        return tbSysUserByConnKeyUser;
    }

    public void setTbSysUserByConnKeyUser(TbSysUserEntity tbSysUserByConnKeyUser) {
        this.tbSysUserByConnKeyUser = tbSysUserByConnKeyUser;
    }
}
