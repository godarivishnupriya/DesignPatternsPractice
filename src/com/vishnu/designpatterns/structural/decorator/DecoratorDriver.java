package com.vishnu.designpatterns.structural.decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " => " + coffee.getCost());


        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " => " + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println(sugarCoffee.getDescription() + " => " + sugarCoffee.getCost());

        Coffee milkSugarCoffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println(milkSugarCoffee.getDescription() + " => " + milkSugarCoffee.getCost());
    }
}

