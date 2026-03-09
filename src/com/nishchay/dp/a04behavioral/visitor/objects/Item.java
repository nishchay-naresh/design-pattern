package com.nishchay.dp.a04behavioral.visitor.objects;

import com.nishchay.dp.a04behavioral.visitor.IVisitor;

public abstract class Item {

    public abstract double getPrice();

    public abstract double accept(IVisitor visitor);


}