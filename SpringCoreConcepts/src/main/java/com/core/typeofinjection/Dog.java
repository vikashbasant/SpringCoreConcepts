package com.core.typeofinjection;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("t-dog")
@Primary
public class Dog implements Animal {
    @Override
    public void play() {
        System.out.println("dog is playing");
    }
}
