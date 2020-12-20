package com.nishchay.dp.behavioral.visitor.objects;

import com.nishchay.dp.behavioral.visitor.IVisitor;

public abstract class Item {

    public abstract double getPrice();

    public abstract double accept(IVisitor visitor);


}