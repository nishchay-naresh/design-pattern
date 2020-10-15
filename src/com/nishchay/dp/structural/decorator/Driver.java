package com.nishchay.dp.structural.decorator;

public class Driver {

  public static void main(String[] args) {
    // FileReader and BufferedReader are examples of decorator
    Circle circle = new Circle();
    System.out.println("Original object behaviour -");
    circle.draw();

    Shape greenDecorator = new GreenShapeDecorator(circle);
    System.out.println("Decorated object behaviour -");
    greenDecorator.draw();

    BlueAreaShapeDecorator blueAreaShapeDecorator = new BlueAreaShapeDecorator(circle);
    System.out.println("Further Decorated object behaviour -");
    blueAreaShapeDecorator.draw();

  }
}