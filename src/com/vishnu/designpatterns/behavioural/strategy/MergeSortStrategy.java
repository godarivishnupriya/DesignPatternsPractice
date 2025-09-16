package com.vishnu.designpatterns.behavioural.strategy;

import java.util.List;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Merge Sort strategy");
    }
}
