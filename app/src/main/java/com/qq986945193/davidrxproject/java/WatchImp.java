package com.qq986945193.davidrxproject.java;/*
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */

/**
 * 这是一个观察者的实现类
 */
public class WatchImp implements WatchCallback{

    @Override
    public void notifyFunction(String string) {
        System.out.print(string);
    }
}
