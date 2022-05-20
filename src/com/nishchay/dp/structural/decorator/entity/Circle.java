package com.nishchay.dp.structural.decorator.entity;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}