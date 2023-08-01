package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/NewTask")
	public String NewTask() {
		return "NewTask";
	}
	
	@GetMapping("/ListTask")
	public String ListTask() {
		return "ListTask";
	}

}
