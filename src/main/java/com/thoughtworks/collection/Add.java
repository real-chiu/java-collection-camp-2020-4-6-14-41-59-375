package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        arrayList.reduce(0, ())
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        IntStream stream = IntStream.range(leftBorder, rightBorder + 1);
        return stream.reduce(0, (sum, element) -> {
            if (element % 2 == 0) {
                return sum + element;
            } else {
                return sum;
            }
        });
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        IntStream stream = IntStream.range(leftBorder, rightBorder + 1);
        return stream.reduce(0, (sum, element) -> {
            if (element % 2 != 0) {
                return sum + element;
            } else {
                return sum;
            }
        });
    }

}
