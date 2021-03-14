package cn.carl.std.cocoadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 通用Repository
 *
 * @param <E> 实体类       <T, ID>
 * @param <T> id主键类型   <T, ID>
 */
@NoRepositoryBean //因为没有具体表映射 作为parent只用作继承
public interface CommonRepository<E,T> extends JpaRepository<E,T>, JpaSpecificationExecutor<E> {
}
