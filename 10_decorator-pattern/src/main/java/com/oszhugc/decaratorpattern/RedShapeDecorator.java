package com.oszhugc.decaratorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:01
 **/
public class RedShapeDecorator extends ShapeDecortor {

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("border color: red");
    }
}
