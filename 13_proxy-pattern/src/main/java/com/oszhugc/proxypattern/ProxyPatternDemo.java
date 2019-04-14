package com.oszhugc.proxypattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 12:37
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
