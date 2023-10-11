package com.example.springwebmvc.service;


import com.example.springwebmvc.model.entity.TodoEntity;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface TodoService {
    CompletableFuture<TodoEntity> createTodo(TodoEntity todo);

    CompletableFuture<List<TodoEntity>> getAllTodos();

    CompletableFuture<TodoEntity> getTodoById(long id);

    CompletableFuture<TodoEntity> updateTodoById(long id, TodoEntity updatedTodo);

    CompletableFuture<Void> deleteTodoById(long id);
}
