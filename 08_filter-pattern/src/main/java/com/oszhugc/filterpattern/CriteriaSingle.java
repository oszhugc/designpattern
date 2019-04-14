package com.oszhugc.filterpattern;

import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:39
 **/
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> singlePersons = new ArrayList<Person>();
        for (Person person: persons
             ) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
