package com.oszhugc.iteratorpattern;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 15:24
 **/
public class NameRepository implements Container {

    public String names[] = {"robert","john","julie","lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
