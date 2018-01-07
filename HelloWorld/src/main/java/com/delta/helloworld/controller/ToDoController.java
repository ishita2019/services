package com.delta.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.delta.helloworld.services.ToDoService;

@Controller
@SessionAttributes("name")
public class ToDoController {
    @Autowired
    ToDoService service;
    @RequestMapping(value="/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
        String name = (String) model.get("name");
        model.addAttribute("todos", service.retrieveTodos(name));
        model.put("todosblnk", new String("Blank"));
        return "list-todos";
    }
}