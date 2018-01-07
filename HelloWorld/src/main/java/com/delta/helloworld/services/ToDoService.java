package com.delta.helloworld.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import  com.delta.helloworld.model.ToDo;

@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<ToDo>();
    private static int todoCount = 3;
    static {
        todos.add(new ToDo(1, "inDelta", "Learn Spring MVC", new Date(),
                false));
        todos.add(new ToDo(2, "inDelta", "Learn Struts", new Date(), false));
        todos.add(new ToDo(3, "inDelta", "Learn Hibernate", new Date(),
                false));
    }
    public List<ToDo> retrieveTodos(String user) {
        List<ToDo> filteredTodos = new ArrayList<ToDo>();
        for (ToDo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
