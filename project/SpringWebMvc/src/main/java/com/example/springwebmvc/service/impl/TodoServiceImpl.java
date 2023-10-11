package com.example.springwebmvc.service.impl;

import com.example.springwebmvc.model.entity.TodoEntity;
import com.example.springwebmvc.repository.TodoRepository;
import com.example.springwebmvc.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public CompletableFuture<TodoEntity> createTodo(TodoEntity todo) {
        // 비즈니스 로직 구현
        if (todoRepository.existsById(todo.getId())) {
            //TODO 에러 처리 필요
        } else {
            //ProviderId Sequence +1 하는 부분
            if (todoRepository.count() != 0) {
                todo.setId(todoRepository.getMaxId() + 1);
            } else {
                todo.setId(1L);
            }
        }
        return CompletableFuture.completedFuture(todoRepository.save(todo));
    }

    @Override
    public CompletableFuture<List<TodoEntity>> getAllTodos() {
        return CompletableFuture.completedFuture(todoRepository.findAll());
    }

    @Override
    public CompletableFuture<TodoEntity> getTodoById(long id) {
        return CompletableFuture.supplyAsync(() -> todoRepository.findById(id).orElse(null));
    }

    @Override
    public CompletableFuture<TodoEntity> updateTodoById(long id, TodoEntity updatedTodo) {
        return CompletableFuture.supplyAsync(() -> {
            TodoEntity existingTodo = todoRepository.findById(id).orElse(null);
            if (existingTodo != null) {
                // 업데이트 로직을 여기에 구현
                existingTodo.setTitle(updatedTodo.getTitle());

                // 업데이트된 내용을 저장
                todoRepository.save(existingTodo);
            }
            return existingTodo;
        });
    }

    @Override
    public CompletableFuture<Void> deleteTodoById(long id) {
        return CompletableFuture.runAsync(() -> {
            todoRepository.deleteById(id);
        });
    }

}