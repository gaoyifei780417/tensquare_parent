package com.bwei.tensquare_common;

import util.IdWorker;

/**
 * @User feifei
 * @ClassName Test  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 19:28  时间
 * @Version 1.0 版本
 */
public class Test {
    public static void main(String[] args) {
        IdWorker idWorker = new IdWorker(1, 1);
        long nextId = idWorker.nextId();
        System.out.println(nextId);
    }

}
