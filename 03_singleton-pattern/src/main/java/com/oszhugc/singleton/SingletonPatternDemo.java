package com.oszhugc.singleton;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:39
 **/
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //获取对象,并显示消息
        SingletonObject.getInstance().showMsg();
    }
}
