package com.oszhugc.adapterpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 22:02
 **/
public class Mp4Player implements  AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("playing mp4 file. name : " +fileName);
    }
}
