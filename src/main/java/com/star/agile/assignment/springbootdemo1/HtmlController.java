package com.star.agile.assignment.springbootdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
	    return "index";
	}

	@RequestMapping(value = "/Hello", method = RequestMethod.GET)
	public String anotherIndex() {
	    return "Helloworld";
	}
	
}
