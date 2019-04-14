package com.oszhugc.observerpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:53
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
