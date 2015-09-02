package com.magikey.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * Created by dingyan on 15/8/20.
 */
@MappedSuperclass
public abstract class BaseEntity {
    private Timestamp createTime;
    private Boolean deltag;

    @Basic
    @Column(name = "CREATE_TIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "DELTAG", nullable = true, insertable = true, updatable = true)
    public Boolean getDeltag() {
        return deltag;
    }

    public void setDeltag(Boolean deltag) {
        this.deltag = deltag;
    }
}
