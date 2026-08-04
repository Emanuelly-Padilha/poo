package br.edu.ifpr.todolistif.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifpr.todolistif.model.Todo;
import br.edu.ifpr.todolistif.repository.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // criar uma nova tarefa
    @PostMapping("/create")
    public String create(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    /*
     * @GetMapping("/")
     * public String index() {
     * return "index";
     * }
     * 
     */
    @GetMapping("/")
    public ModelAndView list() { // Model cria uma visão modelo
        return new ModelAndView(
                "todoLisf/list", Map.of("todos", todoRepository.findAll()));
    }
     

}
