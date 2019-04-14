package com.oszhugc.commandpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:05
 **/
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
