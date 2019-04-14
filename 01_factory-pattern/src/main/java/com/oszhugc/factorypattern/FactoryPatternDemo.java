package com.oszhugc.factorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:02
 **/
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFacotory shapeFacotory = new ShapeFacotory();

        //获取circle对象,并调用draw方法
        shapeFacotory.getShape("circle").dram();

        //获取rectangle对象,并调用draw方法
        shapeFacotory.getShape("rectangle").dram();

        //获取square对象,并调用draw方法
        shapeFacotory.getShape("square").dram();
    }
}
