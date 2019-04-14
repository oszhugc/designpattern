package com.oszhugc.singleton;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:37
 **/
public class SingletonObject {

    //创建一个singletonObject对象
    private static SingletonObject instance = new SingletonObject();

    //让构造函数为private,这样该类就不会被实例化
    private SingletonObject(){}

    //获取唯一可用的对象
    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMsg(){
        System.out.println("hello world");
    }

}
