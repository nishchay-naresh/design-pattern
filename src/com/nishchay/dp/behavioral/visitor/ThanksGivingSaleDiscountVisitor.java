package com.nishchay.dp.behavioral.visitor;

import com.nishchay.dp.behavioral.visitor.objects.Earphone;
import com.nishchay.dp.behavioral.visitor.objects.Laptop;
import com.nishchay.dp.behavioral.visitor.objects.Mobile;
import com.nishchay.dp.behavioral.visitor.objects.TV;

public class ThanksGivingSaleDiscountVisitor implements IVisitor {

    public ThanksGivingSaleDiscountVisitor() {
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
        return earphoneItem.getPrice() * 8 / 100;
    }

    @Override
    public double visit(Laptop laptopItem) {
        return laptopItem.getPrice() * 15 / 100;
    }

}