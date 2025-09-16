package com.vishnu.designpatterns.structural.bridge;

public class BridgePatternShapesDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueRectangle = new Rectangle(new BlueColor());

        redCircle.draw();
        blueRectangle.draw();
    }
}

