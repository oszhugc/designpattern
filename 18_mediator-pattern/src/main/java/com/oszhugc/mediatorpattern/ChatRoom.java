package com.oszhugc.mediatorpattern;

import java.util.Date;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:34
 **/
public class ChatRoom {
    public static void showMsg(User user,String msg){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + msg);
    }
}
