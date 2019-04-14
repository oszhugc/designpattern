package com.oszhugc.singleton;

/**
 * 登记式/静态内部类
 * 这种方式能达到双重检验锁一样的功效,但实现简单. 对静态域使用延迟初始化,应该使用这种方式而不是双重检验锁
 * 这种方式只使用于静态域的情况,双重检验锁可在实例域需要延迟初始化时使用
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 15:58
 **/
public class Singleton05 {

    private Singleton05(){}

    public static Singleton05 getInstance(){
        return Singleton05Holder.INSTANCE;
    }


    public static class Singleton05Holder{
        private static final Singleton05 INSTANCE = new Singleton05();
    }
}
