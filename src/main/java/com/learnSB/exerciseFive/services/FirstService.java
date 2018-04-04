package com.learnSB.exerciseFive.services;


import org.springframework.stereotype.Service;


@Service
public class FirstService {
	
    public String myServiceString(){
        return "here's some data from the service";
    }

}