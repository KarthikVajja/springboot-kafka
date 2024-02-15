package com.karthik.springbootkafka;

import java.util.*;
// import java.math.*;
import java.util.stream.*;



class Solution {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,6,7,8,9,4);
        System.out.println(
            nums.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()))
                .entrySet().stream()
                .filter(e->e.getValue().size()>1)
                .max((e1,e2)-> Integer.compare(e1.getValue().size(), e2.getValue().size()))
                .map(e->e.getKey())
                .map(e->String.valueOf(e))
                .get()
        );
        System.out.println(
            nums.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()))
                .entrySet().stream()
                .max((e1,e2)-> Integer.compare(e1.getValue().size(), e2.getValue().size()))
                .map(e->e.getKey())
                .orElseThrow()
        );
    }
    // public static Person getOldestPerson(List<Person> people) {
    //     return people.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).findFirst().get();
	// }
}