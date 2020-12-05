package com.nishchay.dp.structural.composite;

public class Developer implements IEmployee {

    private String name;
    private int salary;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void addEmployee(IEmployee emp) {
        System.out.println("NA");
    }

    @Override
    public void removeEmployee(IEmployee emp) {
        System.out.println("NA");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void showAllEmployees() {
        System.out.println("NA");
    }

    @Override
    public void doWork() {
        System.out.println(name + " - Doing development work ...!!!");
    }

}