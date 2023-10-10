package com.goregoreda.todolistwithwebflux.service;

import com.goregoreda.todolistwithwebflux.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {
    Mono<Todo> createTodo(Todo todo);

    Flux<Todo> getAllTodos();

    Mono<Todo> getTodoById(String id);
}
