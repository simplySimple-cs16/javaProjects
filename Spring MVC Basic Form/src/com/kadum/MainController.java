package com.kadum;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}

	@RequestMapping("displayname") //default method is get so we don't need to specify method and when there is 
	//only one parameter, it defaults to value
	//displayname is same as the name given in action param of form tag
	public String displayName(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		request.setAttribute("firstName", firstName);
		return "displayName";
	}
	
}
