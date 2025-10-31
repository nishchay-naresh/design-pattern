package com.nishchay.dp.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {


        Registry registry = new Registry();
        registry.showData();

        Movie m1 = (Movie) registry.createItem("movie");
        m1.setTitle("Transformers");
        m1.setPrice(674.00);
        m1.setDuration("2Hr 15Mts");
        System.out.println(m1);
        System.out.println(m1.hashCode());

        Movie m2 = (Movie) registry.createItem("movie");
        m2.setTitle("Lord Of The Ring");
        m1.setPrice(345.84);
        m1.setDuration("1Hr 55Mts");
        System.out.println(m2);
        System.out.println(m2.hashCode());

        Book b1 = (Book) registry.createItem("book");
        b1.setTitle("2 States");
        b1.setPrice(376.90);
        b1.setNoOfPage("678 Pages");
        System.out.println(b1);

        Book b2 = (Book) registry.createItem("book");
        b2.setTitle("The Alchemist");
        b2.setPrice(158.00);
        b2.setNoOfPage("278 Pages");
        System.out.println(b2);

    }

}
