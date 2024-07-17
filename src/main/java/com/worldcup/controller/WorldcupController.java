package com.worldcup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldcupController {
	
	@GetMapping("/test")
	public String TestApi()
	{
		return"Test Api";
	}

}
