package com.nishchay.dp.behavioral.visitor.objects;

import com.nishchay.dp.behavioral.visitor.IVisitor;

public class Laptop extends Item {

    private int price;

    public Laptop(int price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

}
