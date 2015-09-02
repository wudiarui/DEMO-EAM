package com.magikey.common.repository.impl;

import com.magikey.common.repository.BaseRepository;

import com.magikey.common.entity.BaseEntity;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dingyan on 15/8/18.
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    private final EntityManager em;

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);

        Assert.notNull(domainClass);
        Assert.notNull(entityManager);


        this.em = entityManager;
    }

    @Override
    public void logicDrop(ID id) {
        T entity = findOne(id);
        if(null == entity || !(entity instanceof BaseEntity)) {
            return;
        }
        BaseEntity model = (BaseEntity)entity;
        model.setDeltag(Boolean.TRUE);
        this.em.merge(model);
    }

    @Override
    public void logicDrop(T t) {
        if(null == t || !(t instanceof BaseEntity)) {
            return;
        }
        BaseEntity model = (BaseEntity)t;
        model.setDeltag(true);

        this.em.merge(t);
    }

    @Override
    public int logicBatchDrop(List<T> list) {
        if(null == list) { return 0; }
        int i = 0;
        for (T entity : list) {
            logicDrop(entity);
            i++;
        }
        return i;
    }
}
