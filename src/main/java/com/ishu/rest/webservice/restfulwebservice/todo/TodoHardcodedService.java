package com.ishu.rest.webservice.restfulwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RestController;

@Service
public class TodoHardcodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "ishvinder", "Learn Java", new Date(), false));
        todos.add(new Todo(++idCounter, "ishvinder", "Learn Angualar", new Date(), false));
        todos.add(new Todo(++idCounter, "ishvinder", "Learn Spring", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}
