package com.vishnu.designpatterns.structural.bridge;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Circle filled with ");
        color.applyColor();
    }
}
