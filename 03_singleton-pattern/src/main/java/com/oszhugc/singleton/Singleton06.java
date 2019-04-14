package com.oszhugc.singleton;

/**
 * 枚举
 * 这种方式还没有被广泛使用,但是是实现单例模式的最佳方案.不但简洁,还自动支持序列化机制,绝对防止多次实例化
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 16:03
 **/
public enum  Singleton06 {

    INSTANCE();

    public void whateverMethod(){

    }
}
