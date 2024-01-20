package com.core.typeofinjection;

import org.springframework.stereotype.Component;

@Component("t-cat")
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
