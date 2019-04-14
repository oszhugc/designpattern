package com.oszhugc.bridgepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:23
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }

    abstract void draw();
}
