package com.oszhugc.singleton;

/**
 * 懒汉式,线程不安全
 * 这种方式是最基本的实现方式,这种实现最大的问题及时不支持多线程. 因为没有加锁synchronized, 所以严格意义上
 * 它并不算单例模式. 这种方式lazy loading很明显,不要求线程安全, 在多线程补不能正常工作
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 15:42
 **/
public class Singleton01 {

    private static Singleton01 instance;

    private Singleton01(){}

    public static Singleton01 getInstance(){
        if(instance == null){
            instance = new Singleton01();
        }
        return instance;
    }
}
