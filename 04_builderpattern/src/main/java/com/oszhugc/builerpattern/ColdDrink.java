package com.oszhugc.builerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:18
 **/
public abstract class ColdDrink implements Item{

    public Packing packing() {
        return new Bottle();
    }
}
