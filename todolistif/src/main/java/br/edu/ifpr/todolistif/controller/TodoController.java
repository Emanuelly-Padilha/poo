package br.edu.ifpr.todolistif.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpr.todolistif.model.Todo;
import br.edu.ifpr.todolistif.repository.TodoRepository;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // listar as tarefas
    @GetMapping("/")
    public ModelAndView list() { // Model cria uma visão modelo
        return new ModelAndView(
                "todoLisf/list", Map.of("todos", todoRepository.findAll()));
    }

    // criar uma nova tarefa
    @PostMapping("/create")
    public String create(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    // exibir o formulário de edição já preenchido com os dados da tarefa
    @GetMapping("/edit/{id}")
    public ModelAndView editForm(@PathVariable Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tarefa não encontrada: " + id));
        return new ModelAndView("todoLisf/edit", Map.of("todo", todo));
    }

    // alterar (atualizar) uma tarefa existente
    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, Todo todo) {
        Todo existente = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tarefa não encontrada: " + id));

        existente.setTitle(todo.getTitle());
        existente.setDeadLine(todo.getDeadLine());
        todoRepository.save(existente);

        return "redirect:/";
    }

}
