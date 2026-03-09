package com.nishchay.dp.a04behavioral.visitor;

import com.nishchay.dp.a04behavioral.visitor.objects.Earphone;
import com.nishchay.dp.a04behavioral.visitor.objects.Laptop;
import com.nishchay.dp.a04behavioral.visitor.objects.Mobile;
import com.nishchay.dp.a04behavioral.visitor.objects.TV;

public interface IVisitor {

    double visit(Mobile mobileItem);

    double visit(TV TVItem);

    double visit(Earphone earphoneItem);

    double visit(Laptop laptopItem);

}