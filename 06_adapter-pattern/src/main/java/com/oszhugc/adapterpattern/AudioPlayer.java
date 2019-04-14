package com.oszhugc.adapterpattern;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 22:07
 **/
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;


    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file. Name: "+fileName);
        }
        //mediaAdapter提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
        || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else {
            System.out.println("invalid media. "+audioType + " format not supported");
        }

    }
}
