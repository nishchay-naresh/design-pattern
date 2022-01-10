package com.nishchay.dp.solidprinciples.di;


/*
 * => Every dependency in the design should depend upon abstractions rather than concrete implementation
 * Dependency Inversion principle states that:
 *   1.	High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *   2.	Abstractions should not depend on details. Details should depend on abstractions.
 *
 *=> Every dependency in the design should target an interface or an abstract class.
 *   No dependency should target a concrete class.
 *
 * */
public class WithoutDI {

    public static void main(String[] args) {
        Project project = new Project();
        project.implement();

    }
}

class BackEndDeveloper {
    void writeJava() {
        System.out.println("java code");
    }
}

class FrontEndDeveloper {
    void writeJavascript() {
        System.out.println("javascript code");
    }
}

class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    void implement() {
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