package com.oszhugc.abstractfactorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:14
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
