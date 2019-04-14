package com.oszhugc.filterpattern;

import java.util.List;

/**
 * @author oszhugc
 * @Date 2019\4\14 0014 11:43
 **/
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCritiaPersons = otherCriteria.meetCriteria(persons);
        for (Person person : otherCritiaPersons){
            if(!firstCriteriaPersons.contains(person)){
                firstCriteriaPersons.add(person);
            }
        }

        return firstCriteriaPersons;
    }
}
