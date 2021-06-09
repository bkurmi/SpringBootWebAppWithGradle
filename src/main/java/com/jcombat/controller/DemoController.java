package com.jcombat.controller;

import java.util.List;
import java.util.Map;

import com.jcombat.beans.User;
import com.jcombat.service.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		//Logging
		//Business logic ....
		//Logging
		System.out.println("TEST COMM");
		return "welcome";
	}

}