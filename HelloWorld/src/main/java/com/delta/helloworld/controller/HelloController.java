package com.delta.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping(value= "/")
    public String helloWithoutJsp() {
        
        return "Hello, Good Morning Ishita";
    }
	@RequestMapping(value= "/hello",method = RequestMethod.GET)
	public String helloWithJsp(ModelMap  model, @RequestParam(value="name", required=false, defaultValue="Delta Airlines") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

}
