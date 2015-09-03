package com.saurzcode.swaggerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

@Controller
public class HelloController {
	@RequestMapping(method=RequestMethod.GET,value="saurzcode/sayHello")
	@ApiOperation(httpMethod = "GET", value = "Say Hello To World using Swagger")
	public String sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	 @RequestMapping(method=RequestMethod.GET,value="saurzcode/greeting1")
	 @ApiOperation(httpMethod = "GET", value = "Say Greetings To World using Swagger")
	    public String greeting1(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
	

}