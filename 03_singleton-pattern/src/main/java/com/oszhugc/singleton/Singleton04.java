package com.oszhugc.singleton;

/**
 * 双重检验锁 DCL
 * 这种方式采用双锁机制, 安全且在多线程情况下能保持高性能
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 15:53
 **/
public class Singleton04 {

    private volatile static Singleton04 instance;

    private Singleton04(){}

    public static Singleton04 getInstance(){
        if(instance == null){
            synchronized (Singleton04.class){
                if (instance == null){
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
