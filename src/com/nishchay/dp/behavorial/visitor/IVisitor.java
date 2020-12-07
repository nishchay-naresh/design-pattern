package com.nishchay.dp.behavorial.visitor;

import com.nishchay.dp.behavorial.visitor.objects.Earphone;
import com.nishchay.dp.behavorial.visitor.objects.Laptop;
import com.nishchay.dp.behavorial.visitor.objects.Mobile;
import com.nishchay.dp.behavorial.visitor.objects.TV;

public interface IVisitor {

    double visit(Mobile mobileItem);

    double visit(TV TVItem);

    double visit(Earphone earphoneItem);

    double visit(Laptop laptopItem);

}