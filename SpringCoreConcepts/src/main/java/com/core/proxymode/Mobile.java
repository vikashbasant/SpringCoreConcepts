package com.core.proxymode;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@Scope("singleton")
public class Mobile {

    @Autowired
    private Recharge recharge;

    Mobile() {
        System.out.println("Mobile Constructor... is called");
    }

}
