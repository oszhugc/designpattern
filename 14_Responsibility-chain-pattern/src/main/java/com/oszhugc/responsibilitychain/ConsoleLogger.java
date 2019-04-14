package com.oszhugc.responsibilitychain;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 14:48
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("standard console::Logger:"+msg);
    }
}
