package com.oszhugc.bridgepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:22
 **/
public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println();System.out.println("drawing circle[ color:green; redus:"+radius+"; x:"+x+"; y:"+y);
    }
}
