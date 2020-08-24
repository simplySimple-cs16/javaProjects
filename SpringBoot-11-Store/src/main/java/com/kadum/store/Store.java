package com.kadum.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Store {
	
	@RequestMapping("/")
	public String home () {
		return "home";
	}
	
}
