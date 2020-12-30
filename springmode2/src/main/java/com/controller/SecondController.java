package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="emp")
public class SecondController {
	
	@GetMapping("/one")
	public String first()
	{
		return "second";
	}

}
