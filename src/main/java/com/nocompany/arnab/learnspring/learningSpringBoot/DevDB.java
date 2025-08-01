package com.nocompany.arnab.learnspring.learningSpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements  DB{

    public String get_data(){
        return "dev data";
    }
}
