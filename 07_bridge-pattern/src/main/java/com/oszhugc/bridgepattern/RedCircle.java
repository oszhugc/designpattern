package com.oszhugc.bridgepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:20
 **/
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing circle[ color:red; redus:"+radius+"; x:"+x+"; y:"+y);
    }
}
