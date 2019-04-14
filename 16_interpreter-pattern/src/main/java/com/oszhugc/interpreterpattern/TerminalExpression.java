package com.oszhugc.interpreterpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:15
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String contexts) {
        if(contexts.contains(data)){
            return true;
        }
        return false;
    }
}
