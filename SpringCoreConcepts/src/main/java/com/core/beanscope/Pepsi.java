package com.core.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pepsi {

    public Pepsi() {
        System.out.println("Creating Pepsi");
    }

    public void drink() {
        System.out.println("Very Cool is Pepsi");
    }

}
