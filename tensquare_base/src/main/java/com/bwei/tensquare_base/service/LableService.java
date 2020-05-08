package com.bwei.tensquare_base.service;

import com.bwei.tensquare_base.bean.Lable;
import com.bwei.tensquare_base.dao.LableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @User feifei
 * @ClassName LableService  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 20:13  时间
 * @Version 1.0 版本
 */
@Service
public class LableService {
    @Autowired
    private LableDao lableDao;
    public Lable getById(String id) {
        return lableDao.getById(id);
    }

    @Modifying
    @Transactional
    public void add(Lable lable) {
        lableDao.save(lable);
    }

    public List<Lable> list() {
       return lableDao.findAll();
    }

    @Modifying
    @Transactional
    public Lable update(Lable lable) {
        //save判断如果id不存在则新增,id存在,则修改
        return lableDao.save(lable);
    }
    @Modifying
    @Transactional
    public void delete(String id) {
        lableDao.deleteById(id);
    }
}
