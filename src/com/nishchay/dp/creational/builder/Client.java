package com.nishchay.dp.creational.builder;

public class Client {


    public static void main(String[] args) {

        User user1 = new User.UserBuilder("Iron", "Man")
                .age(30)
                .phone("1234567")
                .city("Florida")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Wonder", "Women")
                .age(35)
                .phone("5655")
                //no city
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }


}

