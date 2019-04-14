package com.oszhugc.responsibilitychain;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 14:49
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error Console::Logger"+msg);
    }
}
