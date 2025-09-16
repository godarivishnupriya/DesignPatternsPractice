package com.vishnu.designpatterns.creational.builder;

public class User {
    // fields are private (encapsulation)
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    // private constructor, only Builder can access
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters (no setters for immutability)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // Static Inner Builder class
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this; // allows chaining
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this); // pass builder to outer constructor
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}