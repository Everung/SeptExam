package com.allinpay.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(ProviderApplication.class,args);
        String userName=configurableApplicationContext.getEnvironment().getProperty("user.name");
        String userAge=configurableApplicationContext.getEnvironment().getProperty("user.age");
        System.out.println("userName: "+userName);
        System.out.println("userAge: "+userAge);
    }
}
