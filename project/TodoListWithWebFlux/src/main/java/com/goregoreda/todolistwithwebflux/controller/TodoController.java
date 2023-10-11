package com.goregoreda.todolistwithwebflux.controller;

import com.goregoreda.todolistwithwebflux.model.entity.TodoEntity;
import com.goregoreda.todolistwithwebflux.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public Flux<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Mono<TodoEntity> getTodoById(@PathVariable long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Mono<TodoEntity> createTodo(@RequestBody TodoEntity todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Mono<TodoEntity> updateTodo(@PathVariable long id, @RequestBody TodoEntity updatedTodo) {
        return todoService.updateTodoById(id, updatedTodo);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteTodo(@PathVariable long id) {
        return todoService.deleteTodoById(id);
    }
}
