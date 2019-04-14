package com.oszhgc.momentopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:43
 **/
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
