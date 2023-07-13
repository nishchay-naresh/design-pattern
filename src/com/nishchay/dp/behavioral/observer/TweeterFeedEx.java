package com.nishchay.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


/*
 * ==================== observer design pattern =======================
 *
 * A common solution when an object (called the subject) needs to
 * automatically notify a list of other objects (called observers) when some event happens (for example, a state change).
 *
 * Here we are notifying all the observers, but only one of them is getting executed based on type of feed
 *
 * */
public class TweeterFeedEx {
    public static void main(String[] args) {
        legacyWay();
        System.out.println("---------------------------------");
        lambdaWay();
    }

    private static void legacyWay() {
        Feed feed = new Feed();
        feed.registerObserver(new ETMoney());
        feed.registerObserver(new CricketBuzz());
        feed.registerObserver(new TOINews());

        feed.notifyObservers("Maharashtra politics crisis - NCP making aliens with BJP ");
        feed.notifyObservers("Stock Market - NIFTY closes on all time high at 27000 ");
    }

    /*
    *  Since Observer interface is a Functional Interface
    *  So rather implementing the Observer interface under different classes ,
    *  we can inject the different behaviour using lambda
    *
    * */

    public static void lambdaWay() {
        Feed feed = new Feed();
        feed.registerObserver((String tweet) -> {
            if (tweet != null && tweet.toLowerCase().contains("stock")) {
                System.out.println("Stock Market feed " + tweet);
            }
        });

        feed.registerObserver((String tweet) -> {
            if (tweet != null && tweet.toLowerCase().contains("cricket")) {
                System.out.println("This hour cricket news - " + tweet);
            }
        });

        feed.registerObserver((String tweet) -> {
            if (tweet != null && tweet.toLowerCase().contains("politics")) {
                System.out.println("This hour politics news - " + tweet);
            }
        });

        feed.notifyObservers("Maharashtra politics crisis - NCP making aliens with BJP ");
        feed.notifyObservers("Stock Market - NIFTY closes on all time high at 27000 ");
    }


    interface Observer {
        void notify(String tweet);
    }

    interface Subject {
        void registerObserver(Observer o);

        void notifyObservers(String tweet);
    }


    static class Feed implements Subject {
        private final List<Observer> observers = new ArrayList<>();

        public void registerObserver(Observer o) {
            this.observers.add(o);
        }

        public void notifyObservers(String tweet) {
            observers.forEach(o -> o.notify(tweet));
        }
    }

    static class ETMoney implements Observer {
        public void notify(String tweet) {
            if (tweet != null && tweet.toLowerCase().contains("stock")) {
                System.out.println("Stock Market feed " + tweet);
            }
        }
    }

    static class CricketBuzz implements Observer {
        public void notify(String tweet) {
            if (tweet != null && tweet.toLowerCase().contains("cricket")) {
                System.out.println("This hour cricket news - " + tweet);
            }
        }
    }

    static class TOINews implements Observer {
        public void notify(String tweet) {
            if (tweet != null && tweet.toLowerCase().contains("politics")) {
                System.out.println("This hour politics news - " + tweet);
            }
        }
    }
}



