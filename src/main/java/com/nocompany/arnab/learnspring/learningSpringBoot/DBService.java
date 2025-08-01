package com.nocompany.arnab.learnspring.learningSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private DevDB db;
    String get_data(){
        return db.get_data();
    }
}
