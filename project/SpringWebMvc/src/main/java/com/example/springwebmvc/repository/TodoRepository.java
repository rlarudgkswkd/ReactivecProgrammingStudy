package com.example.springwebmvc.repository;

import com.example.springwebmvc.model.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    TodoEntity findByCompleted(boolean completed);
    boolean existsById(long id);

    @Query("SELECT MAX(p.id) FROM TodoEntity p")
    Long getMaxId();
}