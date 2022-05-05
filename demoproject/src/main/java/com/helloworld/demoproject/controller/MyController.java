package com.helloworld.demoproject.controller;

//import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class MyController {

	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String myhome() {	
		
		System.out.println("Hello World from home");
		
		return  "This is from home";

		
}
	
	@RequestMapping(path = "/welcome")
	public ModelAndView myhome2() {	
		
		//ModelAndView modelAndView = new ModelAndView();
	   // modelAndView.setViewName("welcome");
	    return new ModelAndView("welcome");
	    //return "hello";
		
}
}
