package com.core.typeofinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t-person")
public class Person {

    // =>> Filed/Property-Based Injection:


    @Autowired
    private Animal animal;

    @Autowired
    @Qualifier("samosa2")
    private Samosa samosa;


    // =>> Constructor-Based Injection:
//    public Person() {
//
//    }
//
//    @Autowired
//    public Person(@Qualifier("t-cat") Animal animal) {
//
//        System.out.println("calling constructor... auto-wiring!");
//        this.animal = animal;
//    }


    // =>> Setter-Based Injection:
//    @Autowired
//    public void setAnimal(@Qualifier("t-cat") Animal animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal() {
        // using animal
        animal.play();
        samosa.eat();
    }


}
