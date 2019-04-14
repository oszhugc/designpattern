package com.oszhugc.strategypattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:59
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
