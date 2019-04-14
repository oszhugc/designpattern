package com.oszhugc.abstractfactorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:18
 **/
public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if(color == null ){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("green")){
            return new Green();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }


        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
