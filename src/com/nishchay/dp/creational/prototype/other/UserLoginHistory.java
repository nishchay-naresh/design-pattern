package com.nishchay.dp.creational.prototype.other;

import com.nishchay.dp.creational.builder.User;

import java.util.Date;

public class UserLoginHistory implements Cloneable {
    User user;
    Date loggedIn;
    String browserName;
    Date loggedOut;

    public UserLoginHistory(User user) {
        this.user = user;
    }

    public UserLoginHistory clone() throws CloneNotSupportedException{
        System.out.println("Cloning UserHistory object..");
        return (UserLoginHistory) super.clone();
    }

    public static UserLoginHistory UserLoginHistoryPrototype(){

        User user = new User.UserBuilder("Iron", "Man")
                .age(45)
                .phone("1234567")
                .city("Florida")
                .build();

        UserLoginHistory loggedInUser = new UserLoginHistory(user);
        loggedInUser.browserName = "Chrome";
        loggedInUser.loggedIn = new Date();
        loggedInUser.loggedOut = new Date();

        return loggedInUser;
    }

    @Override
    public String toString() {
        return "UserLoginHistory{" +
                "user=" + user +
                ", loggedIn=" + loggedIn +
                ", browserName='" + browserName + '\'' +
                ", loggedOut=" + loggedOut +
                '}';
    }
}
