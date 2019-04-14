package com.oszhugc.templatepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 16:06
 **/
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
