package com.example.springwebmvc.controller;

import com.example.springwebmvc.model.dto.TodoDto;
import com.example.springwebmvc.model.entity.TodoEntity;
import com.example.springwebmvc.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public CompletableFuture<List<TodoDto>> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public CompletableFuture<TodoEntity> getTodoById(@PathVariable long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public CompletableFuture<TodoEntity> createTodo(@RequestBody TodoEntity todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public CompletableFuture<TodoEntity> updateTodo(@PathVariable long id, @RequestBody TodoEntity updatedTodo) {
        return todoService.updateTodoById(id, updatedTodo);
    }

    @DeleteMapping("/{id}")
    public CompletableFuture<Void> deleteTodo(@PathVariable long id) {
        return todoService.deleteTodoById(id);
    }
}
