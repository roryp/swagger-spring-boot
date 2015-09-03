package com.saurzcode.swaggerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordnik.swagger.annotations.ApiOperation;

@Controller
public class GreetingController {

    //@RequestMapping("/greeting")
    @RequestMapping(method=RequestMethod.GET,value="saurzcode/greeting")
    @ApiOperation(httpMethod = "GET", value = "Say Greetings To World using Swagger")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
