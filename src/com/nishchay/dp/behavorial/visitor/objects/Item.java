package com.nishchay.dp.behavorial.visitor.objects;

import com.nishchay.dp.behavorial.visitor.IVisitor;

public abstract class Item {

    public abstract double getPrice();

    public abstract double accept(IVisitor visitor);


}