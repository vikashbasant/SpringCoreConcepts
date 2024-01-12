package com.core.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
