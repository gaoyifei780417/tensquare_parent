package com.bwei.tensquare_base.dao;

import com.bwei.tensquare_base.bean.Lable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @User feifei
 * @ClassName LableDao  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 20:10  时间
 * @Version 1.0 版本
 */
public interface LableDao extends JpaRepository<Lable,String>, JpaSpecificationExecutor<Lable> {

    Lable getById(String id);
}
