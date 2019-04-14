package com.oszhugc.proxypattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:36
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
