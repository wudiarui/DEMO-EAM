package com.magikey.common.repository.impl;

import com.magikey.common.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.data.repository.query.QueryLookupStrategy;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by dingyan on 15/9/2.
 * Base Repository be createBeanProxy
 */
public class SimpleBaseRepositoryFactoryBean<R extends JpaRepository<M, ID>, M, ID extends Serializable>
    extends JpaRepositoryFactoryBean<R, M, ID> {

    public SimpleBaseRepositoryFactoryBean() {
    }

    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new SimpleBaseRepositoryFactory(entityManager);
    }


    private static class SimpleBaseRepositoryFactory<M, ID extends Serializable> extends JpaRepositoryFactory {
        private EntityManager entityManager;

        public SimpleBaseRepositoryFactory(EntityManager entityManager) {
            super(entityManager);
            this.entityManager = entityManager;
        }

        protected Object getTargetRepository(RepositoryMetadata metadata) {
            Class<?> repositoryInterface = metadata.getRepositoryInterface();
            if (isBaseRepository(repositoryInterface)) {
//                JpaEntityInformation<M, ID> entityInformation = getEntityInformation();
                BaseRepositoryImpl repository = new BaseRepositoryImpl<M, ID>((Class<M>) metadata.getDomainType(), entityManager);
                return repository;
            }

            return super.getTargetRepository(metadata);
        }

        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            if (isBaseRepository(metadata.getRepositoryInterface())) {
                return BaseRepositoryImpl.class;
            }
            return super.getRepositoryBaseClass(metadata);
        }

        private boolean isBaseRepository(Class<?> repositoryInterface) {
            return BaseRepository.class.isAssignableFrom(repositoryInterface);
        }
    }
}
