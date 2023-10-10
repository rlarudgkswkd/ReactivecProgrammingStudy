package com.goregoreda.todolistwithwebflux.service.impl;

import com.goregoreda.todolistwithwebflux.model.entity.TodoEntity;
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
    public Mono<TodoEntity> createTodo(TodoEntity todo) {
        // 비즈니스 로직 구현
        return todoRepository.save(todo);
    }

    @Override
    public Flux<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Mono<TodoEntity> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public Mono<TodoEntity> updateTodoById(long id, TodoEntity updatedTodo) {
        return todoRepository.findById(id)
                .flatMap(existingTodo -> {
                    // 업데이트를 위해 기존 Todo 엔터티를 업데이트합니다.
                    existingTodo.setTitle(updatedTodo.getTitle());
                    return todoRepository.save(existingTodo);
                });
    }

    @Override
    public Mono<Void> deleteTodoById(long id) {
        return todoRepository.deleteById(id);
    }

}