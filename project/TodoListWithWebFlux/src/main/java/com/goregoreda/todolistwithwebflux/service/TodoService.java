package com.goregoreda.todolistwithwebflux.service;

import com.goregoreda.todolistwithwebflux.model.entity.TodoEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {
    Mono<TodoEntity> createTodo(TodoEntity todo);

    Flux<TodoEntity> getAllTodos();

    Mono<TodoEntity> getTodoById(long id);

    Mono<TodoEntity> updateTodoById(long id, TodoEntity updatedTodo);

    Mono<Void> deleteTodoById(long id);
}
