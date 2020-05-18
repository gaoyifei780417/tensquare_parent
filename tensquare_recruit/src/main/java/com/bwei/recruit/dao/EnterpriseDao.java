package com.bwei.recruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bwei.recruit.pojo.Enterprise;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface EnterpriseDao extends JpaRepository<Enterprise,String>,JpaSpecificationExecutor<Enterprise>{
    /**
     * 查询热门企业列表
     */
    public List<Enterprise> findAllByIshot(String ishot);
}
