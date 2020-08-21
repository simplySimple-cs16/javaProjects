package com.kadum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("welcome")  //=>path -> baseUrl/welcome
	public String welcome() {
	 return "welcome";
	}

}
