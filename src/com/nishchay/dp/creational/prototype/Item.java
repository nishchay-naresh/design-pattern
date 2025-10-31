package com.nishchay.dp.creational.prototype;

public abstract class Item implements Cloneable {

    private String title;
    private double price;
    private String url;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", price=" + price +
                ", url='" + url + '\'';
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
