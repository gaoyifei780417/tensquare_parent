package com.bwei.tensquare_base.service;

import com.bwei.tensquare_base.bean.Lable;
import com.bwei.tensquare_base.dao.LableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.awt.*;
import java.util.ArrayList;
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

    @Modifying
    public List<Label> findSerach(Lable lable) {
        Specification specification=createSearchStatement(lable);

        return lableDao.findAll(specification);
    }

    //构建查询语句
    private Specification createSearchStatement(Lable lable) {
        return new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cd) {
                List<Predicate> predicateList = new ArrayList<>();
                //拼接构造语句
                if(!StringUtils.isEmpty(lable.getLabelname())){// lablename like
                    predicateList.add(cd.like(root.get("labelname").as(String.class),"%"+lable.getLabelname()+"%"));
                }
                if(!StringUtils.isEmpty(lable.getState())){// state=?
                    predicateList.add(cd.equal(root.get("state").as(String.class),lable.getState()));
                }
                if(!StringUtils.isEmpty(lable.getRecommend())){//recommend
                    predicateList.add(cd.equal(root.get("recommend").as(String.class),lable.getRecommend()));
                }
                return cd.and(predicateList.toArray(new Predicate[predicateList.size()]));
            }
        };
    }

    public Page<Lable> findSerach(Lable lable, Integer page, Integer size) {

        Specification specification = createSearchStatement(lable);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return lableDao.findAll(specification,pageRequest);
    }
}
