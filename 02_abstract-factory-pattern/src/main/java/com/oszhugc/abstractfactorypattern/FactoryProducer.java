package com.oszhugc.abstractfactorypattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:20
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if("shape".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if ("color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return  null;
    }
}
