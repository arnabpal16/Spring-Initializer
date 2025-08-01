package com.nocompany.arnab.learnspring.learningSpringBoot;


import org.springframework.stereotype.Component;

@Component
public class DevDB implements  DB{
    
    public String get_data(){
        return "dev data";
    }
}
