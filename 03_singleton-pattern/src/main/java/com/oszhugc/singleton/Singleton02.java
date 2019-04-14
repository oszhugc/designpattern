package com.oszhugc.singleton;

/**
 * 懒汉式,线程安全
 * 这种方式具备很好的lazy loading, 能够在多线程中很好的工作,但是,效率很低,99%情况下不需要同步
 *
 * @author oszhugc
 * @Date 2019\4\13 0013 15:46
 **/
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02(){}

    public static synchronized Singleton02 getInstance(){
        if(instance == null){
            instance = new Singleton02();
        }
        return instance;
    }
}
