package com.vishnu.designpatterns.structural.bridge;

class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Rectangle filled with ");
        color.applyColor();
    }
}
