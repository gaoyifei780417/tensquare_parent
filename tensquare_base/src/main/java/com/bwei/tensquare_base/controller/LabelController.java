package com.bwei.tensquare_base.controller;

import com.bwei.tensquare_base.bean.Lable;
import com.bwei.tensquare_base.service.LableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @User feifei
 * @ClassName LabelController  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 20:13  时间
 * @Version 1.0 版本
 */
@RestController
@RequestMapping("/lable")
public class LabelController {
    @Autowired
    private LableService lableService;

    @GetMapping("/{id}")
    public Lable getById(@PathVariable String id){
        Lable byId = lableService.getById(id);
        return byId;
    } 
}
