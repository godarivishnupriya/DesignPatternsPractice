package com.vishnu.designpatterns.behavioural.strategy;

import java.util.List;

public class Sorter {
    SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    // setter
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(List<Integer> numbers) {
        sortingStrategy.sort(numbers);
    }
}
