package com.oszhugc.factorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 14:59
 **/
public class ShapeFacotory {

    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }

        return null;
    }
}
