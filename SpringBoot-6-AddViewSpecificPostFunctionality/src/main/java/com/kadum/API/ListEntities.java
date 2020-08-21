package com.kadum.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEntities {
	
	@RequestMapping("listBlogs")
	public String listBlogs() {
		return "listBlogs";
	}
}
