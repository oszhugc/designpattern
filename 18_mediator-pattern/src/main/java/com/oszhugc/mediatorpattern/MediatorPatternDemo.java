package com.oszhugc.mediatorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:36
 **/
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMsg("Hi! John!");
        john.sendMsg("Hello! Robert!");
    }
}
