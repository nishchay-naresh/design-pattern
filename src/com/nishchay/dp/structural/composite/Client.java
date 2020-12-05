package com.nishchay.dp.structural.composite;

public class Client {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Amar", 20000);
        Developer dev2 = new Developer("Akbar", 22000);
        Developer dev3 = new Developer("Anthony", 25000);

        Manager manager = new Manager("Big Boss", 5000000);
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);
        manager.addEmployee(dev3);

        manager.showAllEmployees();

        manager.doWork();
        for(IEmployee emp : manager.getEmployeeList()){
          emp.doWork();
        }

        manager.removeEmployee(dev2);
        manager.showAllEmployees();

    }
}