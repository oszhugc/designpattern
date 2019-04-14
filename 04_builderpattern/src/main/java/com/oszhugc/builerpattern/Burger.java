package com.oszhugc.builerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:17
 **/
public abstract class Burger implements Item{

    public Packing packing() {
        return new Wrapper();
    }

    public float price() {
        return 0;
    }
}
