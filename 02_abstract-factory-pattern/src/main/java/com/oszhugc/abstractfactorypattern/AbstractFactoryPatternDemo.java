package com.oszhugc.abstractfactorypattern;

import javax.xml.parsers.FactoryConfigurationError;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 15:23
 **/
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 1.获取对象工厂, 2. 获取对象  3. 调用方法
        FactoryProducer.getFactory("shape").getShape("circle").draw();

        FactoryProducer.getFactory("color").getColor("red").fill();
    }
}
