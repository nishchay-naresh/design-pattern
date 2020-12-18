package com.nishchay.dp.solidprinciples.di;


/*
 *
 * Dependency Inversion principle states that:
 *   1.	High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *   2.	Abstractions should not depend on details. Details should depend on abstractions.
 *
 *
 * */
public class WithoutDI {

    public static void main(String[] args) {
        Project project = new Project();
        project.implement();

    }
}

class BackEndDeveloper {
    public void writeJava() {
        System.out.println("java code");
    }
}

class FrontEndDeveloper {
    public void writeJavascript() {
        System.out.println("javascript code");
    }
}

class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
/*
 *
 * Here Project class is a high-level module, and it depends on low-level modules such as BackEndDeveloper and FrontEndDeveloper
 *   => violating the first part of the dependency inversion principle
 * Again in Project class, we realize that the methods writeJava() and writeJavascript() are methods bound to the corresponding classes
 *   => violating the second part of the dependency inversion principle
 * */