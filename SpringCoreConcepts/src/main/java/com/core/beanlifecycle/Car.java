package com.core.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("Car Constructor... is called");
    }

    // After Bean Creation above method will execute.
    @PostConstruct
    public void postConstruct() {

        // some initialization
        System.out.println("postConstruct():: Car is Updated...");
    }


    // Before Bean destroys, the above method will execute.
    @PreDestroy
    public void preDestroy() {

        // some un-initialization
        System.out.println("preDestroy():: Car is Destroyed... Bye Bye!");
    }
}
