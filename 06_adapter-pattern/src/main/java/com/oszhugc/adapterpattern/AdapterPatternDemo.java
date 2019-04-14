package com.oszhugc.adapterpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 22:12
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
