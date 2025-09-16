package com.vishnu.designpatterns.behavioural.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrategyDriver {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 7, 6);

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(numbers);

        // switch to different strategy.
        sorter.setSortingStrategy(new QuickSortStrategy());
        sorter.sort(numbers);
    }
}
