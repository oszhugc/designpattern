package com.oszhugc.builerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:21
 **/
public class ChickenBurger extends Burger {

    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
