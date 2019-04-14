package com.oszhugc.templatepattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 16:07
 **/
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
