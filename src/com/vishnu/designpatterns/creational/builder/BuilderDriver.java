package com.vishnu.designpatterns.creational.builder;

public class BuilderDriver {
    public static void main(String[] args) {
        User user1 = new User.Builder()
                .firstName("Vishnupriya")
                .lastName("Godari")
                .age(25)
                .phone("9876543210")
                .address("Hyderabad")
                .build();

        System.out.println("User1: " + user1);
        System.out.println("First Name via getter: " + user1.getFirstName());
    }
}

