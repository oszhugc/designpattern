package com.oszhugc.strategypattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:58
 **/
public class OperationAdd implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
