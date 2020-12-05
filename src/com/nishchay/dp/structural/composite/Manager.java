package com.nishchay.dp.structural.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Manager implements IEmployee {

    private String name;
    private int salary;
    private List<IEmployee> employeeList;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
        employeeList = new LinkedList<>();
    }

    @Override
    public void addEmployee(IEmployee emp) {
        employeeList.add(emp);
    }

    @Override
    public void removeEmployee(IEmployee emp) {
        employeeList.remove(emp);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    public List<IEmployee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public void showAllEmployees() {
        for (IEmployee emp : employeeList) {
            System.out.println("Name:" + emp.getName() + " Salary:" + emp.getSalary());
        }
    }

    @Override
    public void doWork() {
        System.out.println(name + " - Doing team management ...!!!");
    }
}