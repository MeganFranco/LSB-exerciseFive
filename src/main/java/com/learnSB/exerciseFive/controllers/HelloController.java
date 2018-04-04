package com.learnSB.exerciseFive.controllers;

import com.learnSB.exerciseFive.services.FirstService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
    private FirstService firstService;
	
	@RequestMapping("/")
	public String sendTemplate() {
		System.out.println(firstService.myServiceString());
		return "hello";
	}
	
	@RequestMapping("/one")
	public String helloOne() {
		return "one";
	}
	
	@RequestMapping("/two")
	public String helloTwo() {
		return "two";
	}
	
	@RequestMapping("/404")
	public String pageNotFound() {
		return "404";
	}
	
		
}
