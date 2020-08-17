package com.kadum;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}

	@RequestMapping("displayname")
	public String displayName(@RequestParam("firstName") String firstName, Model model) {
		model.addAttribute("name",firstName);
		return "displayName";
	}
}


