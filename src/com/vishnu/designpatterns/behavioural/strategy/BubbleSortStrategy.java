package com.vishnu.designpatterns.behavioural.strategy;

import java.util.List;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Bubble Sort strategy");
    }
}
