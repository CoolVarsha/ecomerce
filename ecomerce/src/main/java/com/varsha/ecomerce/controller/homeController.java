package com.varsha.ecomerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController 
{
	@RequestMapping(value = {"/","/index","/home"})
	public ModelAndView index() {
		return new ModelAndView("index").addObject("greating", "helloworld");
	}
	@RequestMapping(value = "icons")
	public ModelAndView icons() {
		return new ModelAndView("icons").addObject("greating", "helloworld");
	}

}
