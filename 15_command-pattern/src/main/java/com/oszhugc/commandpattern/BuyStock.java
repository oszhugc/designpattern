package com.oszhugc.commandpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:04
 **/
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
