package com.in28minutes.learn_spring_framework.example.c1;


import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[0];
    }
}
