package com.oszhugc.facadepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:11
 **/
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Ractangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
