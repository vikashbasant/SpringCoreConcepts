package com.core.couple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {



    @Autowired
    @Qualifier("dog")
    private Animal animal;

//    @Autowired
//    public Person(@Qualifier("cat") Animal animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal() {
        // using animal

        animal.play();
    }
}
