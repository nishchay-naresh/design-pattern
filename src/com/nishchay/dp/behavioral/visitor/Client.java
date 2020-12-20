package com.nishchay.dp.behavioral.visitor;

import com.nishchay.dp.behavioral.visitor.objects.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new TV(65000));
        items.add(new Earphone(600));
        items.add(new Mobile(16000));
        items.add(new Laptop(30000));


        taxForItemsInCart(items);

        billionDaySaleDiscountForItemsInCart(items);

        thanksGivingSaleDiscountForItemsInCart(items);
    }


    private static void taxForItemsInCart(List<Item> items) {

        System.out.println("-------TaxForItemsInCart-------");

        IVisitor taxVisitor = new TaxVisitor();
        double totalTax, itemTax;
        totalTax = 0;
        for (Item item : items) {
            itemTax = item.accept(taxVisitor);
            System.out.println("itemPrice = " + item.getPrice() + ",\titemTax = " + itemTax);
            totalTax += itemTax;
        }
        System.out.println("Total Tax = " + totalTax);
    }

    private static void billionDaySaleDiscountForItemsInCart(List<Item> items) {

        System.out.println("-------DiscountForItemsInCart : Billion Day-------");

        IVisitor discountVisitor = new BillionDaySaleDiscountVisitor();
        double totalDiscount, itemDiscount;
        totalDiscount = 0;
        for (Item item : items) {
            itemDiscount = item.accept(discountVisitor);
            System.out.println("itemPrice = " + item.getPrice() + ",\titemDiscount = " + itemDiscount);
            totalDiscount += itemDiscount;
        }
        System.out.println("total Discount = " + totalDiscount);
    }

    private static void thanksGivingSaleDiscountForItemsInCart(List<Item> items) {

        System.out.println("-------DiscountForItemsInCart : Thanks Giving-------");

        IVisitor discountVisitor = new BillionDaySaleDiscountVisitor();
        double totalDiscount, itemDiscount;
        totalDiscount = 0;
        for (Item item : items) {
            itemDiscount = item.accept(discountVisitor);
            System.out.println("itemPrice = " + item.getPrice() + ",\titemDiscount = " + itemDiscount);
            totalDiscount += itemDiscount;
        }
        System.out.println("total Discount = " + totalDiscount);
    }
}