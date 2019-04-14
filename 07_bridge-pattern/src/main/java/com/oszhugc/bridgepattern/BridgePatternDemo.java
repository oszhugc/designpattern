package com.oszhugc.bridgepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:26
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
