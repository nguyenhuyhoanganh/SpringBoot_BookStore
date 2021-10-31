package com.Store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
	
	@Autowired
	MessageSource messageSource;
	
	@GetMapping(value = "/hello-world")
	public String helloWorld(HttpServletRequest request) {
		request.setAttribute("msg", messageSource.getMessage("my.name", null, null));
		
		return "index";
	}
}
