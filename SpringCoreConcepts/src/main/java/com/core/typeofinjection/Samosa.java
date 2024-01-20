package com.core.typeofinjection;

public class Samosa {

    private String name;

    public Samosa() {

    }


    public Samosa(String name) {
        this.name = name;
        System.out.println("constructor call: " + name);
    }

    public void eat() {
        System.out.println("Fast Food!: " + this.name);
    }
}
