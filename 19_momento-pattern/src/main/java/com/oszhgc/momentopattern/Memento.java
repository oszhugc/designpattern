package com.oszhgc.momentopattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:41
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
