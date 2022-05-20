package com.nishchay.dp.structural.decorator.features;

import com.nishchay.dp.structural.decorator.entity.Shape;

public class BlueAreaShapeDecorator  extends GreenShapeDecorator {

    public BlueAreaShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setAreaBlue();
    }

    private void setAreaBlue() {
        System.out.println("Area filled with blue");
    }
}
