package com.oszhugc.facadepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:12
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
