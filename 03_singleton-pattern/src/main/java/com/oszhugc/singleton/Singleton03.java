package com.oszhugc.singleton;

/**
 * 饿汉式
 * 这种方式比较常用,但是容易产生垃圾对象
 * 它基于classloader机制避免了多线程同步问题,不过instance在类装载时就实例化,虽然导致类装载的原因有很多种,
 * 在单例模式中大多数都是调用getInstance方法,但是也不能确定有其他凡是导致类装载, 这时候初始化instance显然
 * 没有达到lazy loading的效果
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 15:49
 **/
public class Singleton03 {

    private static Singleton03 instance = new Singleton03();

    private Singleton03 (){}

    public static Singleton03 getInstance(){
        return instance;
    }
}
