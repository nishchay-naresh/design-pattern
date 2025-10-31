
package com.nishchay.dp.creational.prototype;

public class Movie extends Item {

    private String duration;

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" + super.toString() +
                ", duration='" + duration + '\'' +
                '}';
    }
}
