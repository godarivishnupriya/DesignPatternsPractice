package com.vishnu.designpatterns.structural.bridge;

abstract class Shape {
    protected Color color;   // Bridge: Shape HAS a Color

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

