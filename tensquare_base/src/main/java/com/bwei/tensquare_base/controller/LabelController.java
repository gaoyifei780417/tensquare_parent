package com.bwei.tensquare_base.controller;

import com.bwei.tensquare_base.bean.Lable;
import com.bwei.tensquare_base.service.LableService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Result getById(@PathVariable("id") String id){
        Lable byId = lableService.getById(id);
        return new Result(true,StatusCode.OK,"查询成功",byId);
    }
    @PostMapping
    public Result add(@RequestBody Lable lable){
        lableService.add(lable);
        return new Result(true, StatusCode.OK,"添加成功!");
    }
    @GetMapping
    public Result list(){
        List<Lable> lables = lableService.list();
        return new Result(true,StatusCode.OK,lables);
    }
    /**
     * 修改
     */
    @PutMapping("/{id}")
    public Result update(@RequestBody Lable lable,@PathVariable("id") String id){
        lable.setId(id);
        lableService.update(lable);
        return new Result(true,StatusCode.OK,"修改成功!");
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        lableService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功!");
    }
}
