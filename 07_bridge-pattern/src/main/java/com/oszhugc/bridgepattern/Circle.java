package com.oszhugc.bridgepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:24
 **/
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x,int y,int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
