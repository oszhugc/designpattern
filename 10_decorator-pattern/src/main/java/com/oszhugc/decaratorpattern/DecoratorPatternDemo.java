package com.oszhugc.decaratorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:03
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();

        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());

        RedShapeDecorator redRectanble = new RedShapeDecorator(new Rectangle());

        System.out.println("circle with normal border");
        circle.draw();

        System.out.println("\n Circle of red boder");
        redCircle.draw();

        System.out.println("\n Rectangle of red border");
        redRectanble.draw();
    }
}
