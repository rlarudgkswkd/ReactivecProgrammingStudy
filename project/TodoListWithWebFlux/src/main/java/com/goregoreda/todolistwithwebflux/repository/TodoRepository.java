package com.goregoreda.todolistwithwebflux.repository;

import com.goregoreda.todolistwithwebflux.model.entity.TodoEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TodoRepository extends ReactiveCrudRepository<TodoEntity, Long> {
    Flux<TodoEntity> findByCompleted(boolean completed);
}