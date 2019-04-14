package com.oszhugc.responsibilitychain;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 14:50
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("File::Logger:"+msg);
    }
}
