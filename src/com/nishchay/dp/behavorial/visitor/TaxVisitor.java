package com.nishchay.dp.behavorial.visitor;

import com.nishchay.dp.behavorial.visitor.objects.Earphone;
import com.nishchay.dp.behavorial.visitor.objects.Laptop;
import com.nishchay.dp.behavorial.visitor.objects.Mobile;
import com.nishchay.dp.behavorial.visitor.objects.TV;

public class TaxVisitor implements IVisitor {

    public TaxVisitor() {
    }

    @Override
    public double visit(Mobile mobileItem) {
        return mobileItem.getPrice() * 12 / 100;
    }

    @Override
    public double visit(TV TVItem) {
        return TVItem.getPrice() * 18 / 100;
    }

    @Override
    public double visit(Earphone earphoneItem) {
        return earphoneItem.getPrice() * 7 / 100;
    }

    @Override
    public double visit(Laptop laptopItem) {
        return laptopItem.getPrice() * 15 / 100;
    }
}