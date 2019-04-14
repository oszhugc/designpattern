package com.oszhugc.decaratorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:59
 **/
public abstract class ShapeDecortor implements Shape {

    protected Shape decoratedShape;

    public ShapeDecortor(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
