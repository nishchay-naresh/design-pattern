package com.nishchay.dp.structural.decorator;

import com.nishchay.dp.structural.decorator.entity.Circle;
import com.nishchay.dp.structural.decorator.entity.Shape;
import com.nishchay.dp.structural.decorator.features.BlueAreaShapeDecorator;
import com.nishchay.dp.structural.decorator.features.GreenShapeDecorator;
/*
* FileReader and BufferedReader are examples of decorator
*
* Where ever we are doing any feature enhancement for any entity - doing same set of things + sth extra
* 	checkedXxx() : checkedCollection(), checkedList(), checkedMap()
* 	synchronizedXxx() : synchronizedList(), synchronizedMap(), synchronizedSet()
* 	unmodifiableXxx() : unmodifiableSet(), unmodifiableMap() and unmodifiableList()
* methods decorate the received object and return the same.
*
* */
public class Driver {

  public static void main(String[] args) {

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