package com.oszhugc.builerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:24
 **/
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItems(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item: items
             ) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item: items
             ) {
            System.out.println("Item : "+item.name());
            System.out.println("Packing : "+item.packing().pack());
            System.out.println("Price : "+item.price());
        }
    }

}
