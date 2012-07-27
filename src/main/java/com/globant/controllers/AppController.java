package com.globant.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController{

	public AppController(){
	}
	
	@RequestMapping("/")
	public String homeControl(Model model,HttpServletRequest request) {
		model.addAttribute("helloParam","hello moto!");
		return "hello";
	}
}
