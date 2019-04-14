package com.oszhugc.observerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:49
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
