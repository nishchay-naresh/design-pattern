package com.nishchay.dp.structural.decorator.features;

import com.nishchay.dp.structural.decorator.entity.Shape;

public class GreenShapeDecorator extends ShapeDecorator {

  public GreenShapeDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    super.draw();
    setGreenBorder();
  }

  private void setGreenBorder() {
    System.out.println("Border set to green");
  }

}