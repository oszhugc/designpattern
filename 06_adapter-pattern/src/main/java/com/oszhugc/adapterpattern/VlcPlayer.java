package com.oszhugc.adapterpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 22:00
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("playing vlc file. name: "+fileName);
    }

    public void playMp4(String fileName) {
        //do nothing
    }
}
