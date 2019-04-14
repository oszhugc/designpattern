package com.oszhugc.filterpattern;

import java.util.List;

/**
 * @Author oszhugc
 * @Date 2019\4\14 0014 11:35
 * @Version 2.0
 **/
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
