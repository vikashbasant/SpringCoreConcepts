package com.core.config;


import com.core.typeofinjection.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    // Declaring the Bean of Samosa Class:
    @Bean(name = "samosa1")
    @Primary
    public Samosa getSamosa1() {
        return new Samosa("samosa1 for getSamosa1 method");
    }


    @Bean(name = "samosa2")
    public Samosa getSamosa2() {
        return new Samosa("samosa2 for getSamosa2 method");
    }


}
