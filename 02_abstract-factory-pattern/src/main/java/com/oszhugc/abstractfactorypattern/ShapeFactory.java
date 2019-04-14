package com.oszhugc.abstractfactorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:16
 **/
public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("square")){
            return new Square();
        }

        return null;
    }
}
