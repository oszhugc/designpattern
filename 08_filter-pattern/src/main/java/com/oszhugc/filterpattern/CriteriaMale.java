package com.oszhugc.filterpattern;

import com.oszhugc.filterpattern.Criteria;
import com.oszhugc.filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:36
 **/
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> femalePerson = new ArrayList<Person>();
        for (Person person: persons
             ) {
            if (person.getGender().equalsIgnoreCase("female")){
                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}
