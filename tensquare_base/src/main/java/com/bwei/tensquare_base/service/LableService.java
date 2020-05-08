package com.bwei.tensquare_base.service;

import com.bwei.tensquare_base.bean.Lable;
import com.bwei.tensquare_base.dao.LableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
