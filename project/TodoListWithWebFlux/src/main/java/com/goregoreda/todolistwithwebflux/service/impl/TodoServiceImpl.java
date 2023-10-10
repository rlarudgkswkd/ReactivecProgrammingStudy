package com.goregoreda.todolistwithwebflux.service.impl;

import com.goregoreda.todolistwithwebflux.model.Todo;
import com.goregoreda.todolistwithwebflux.repository.TodoRepository;
import com.goregoreda.todolistwithwebflux.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public Mono<Todo> createTodo(Todo todo) {
        // 비즈니스 로직 구현
        return null;
    }

    @Override
    public Flux<Todo> getAllTodos() {
        // 비즈니스 로직 구현
        return null;
    }

    @Override
    public Mono<Todo> getTodoById(String id) {
        // 비즈니스 로직 구현
        return null;
    }

}