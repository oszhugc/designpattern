package com.oszhugc.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:06
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();


    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order: orderList
             ) {
            order.execute();
        }
        orderList.clear();
    }


}
