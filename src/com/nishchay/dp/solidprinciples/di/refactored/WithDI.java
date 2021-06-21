package com.nishchay.dp.solidprinciples.di.refactored;

import java.util.ArrayList;
import java.util.List;

/*
 * The outcome is that the Project class does not depend on lower level modules, but rather abstractions.
 * Also, low-level modules and their details depend on abstractions.
 *
 * */
public class WithDI {

    public static void main(String[] args) {

        List<Developer> developers = new ArrayList<>();
        developers.add(new BackEndDeveloper());
        developers.add(new FrontEndDeveloper());

        Project project = new Project(developers);
        project.implement();
    }
}

interface Developer {
    void develop();
}

class BackEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("java code");
    }
}

class FrontEndDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }

    private void writeJavascript() {
        System.out.println("javascript code");
    }
}

class Project {

    private List<Developer> developers;

    Project(List<Developer> developers) {
        this.developers = developers;
    }

    void implement() {
        developers.forEach(d -> d.develop());
    }

}