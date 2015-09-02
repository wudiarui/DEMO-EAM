package com.magikey.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dingyan on 15/8/18.
 */
public interface BaseRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {
    /**
     * 根据key-id做逻辑删除，执行后将实体的deltag置为1，保证非零为真的原则
     * @param id 序列化主键
     */
    void logicDrop(ID id);

    /**
     * 根据实体对象做逻辑删除，执行后将实体的deltag置为1，保证非零为真的原则
     * @param t 实体对象
     */
    void logicDrop(T t);

    /**
     * 根据实体对象做批量逻辑删除
     * @param list
     * @return 正整数，通知有多少条记录被修改
     */
    int logicBatchDrop(List<T> list);

}
