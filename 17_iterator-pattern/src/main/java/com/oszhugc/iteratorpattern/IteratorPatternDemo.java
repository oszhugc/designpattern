package com.oszhugc.iteratorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:27
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator();iter.hasNext();){
            System.out.println("name : "+(String)iter.next());
        }
    }
}
