package com.oszhugc.builerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:20
 **/
public class VegBurger extends Burger {

    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
