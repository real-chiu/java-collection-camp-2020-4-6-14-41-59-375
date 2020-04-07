package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(element -> (element % 2) == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(element -> (element % 3) == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> common = new ArrayList<Integer>(firstList);
        common.retainAll(secondList);
        return common;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> set = new HashSet<Integer>();
        array.stream().forEach(element -> set.add(element));
        return set.stream().collect(Collectors.toList());
    }
}