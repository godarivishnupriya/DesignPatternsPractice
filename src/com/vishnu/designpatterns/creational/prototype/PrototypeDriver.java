package com.vishnu.designpatterns.creational.prototype;

public class PrototypeDriver {
    public static void main(String[] args) {
        User original = new User("Vishnupriya", 25);

        // clone the object
        User copy = (User) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);

        System.out.println("Are both objects same? " + (original == copy));
    }
}
