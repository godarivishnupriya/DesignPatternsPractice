package com.vishnu.designpatterns.behavioural.strategy;

import java.util.List;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Quick Sort strategy");
    }
}
