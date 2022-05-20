package com.nishchay.dp.structural.decorator.features;

import com.nishchay.dp.structural.decorator.entity.Shape;

/*
* Decorator class identification - implements and have a member attribute of same interface type
* */
public abstract class ShapeDecorator implements Shape {
   // member attribute of interface type to hold the base version of same object
   protected Shape decoratedShape;


    // Decorator object can't be constructed without having a base version of it
    // So no default constructor is there, Only parametrise constructor is there
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   // Not doing anything extra for the implementation method - simply delegating it to the base version
   public void draw(){
      decoratedShape.draw();
   }	
}
