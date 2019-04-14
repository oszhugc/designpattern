package com.oszhugc.mediatorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:33
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String msg){
        ChatRoom.showMsg(this,msg);
    }
}
