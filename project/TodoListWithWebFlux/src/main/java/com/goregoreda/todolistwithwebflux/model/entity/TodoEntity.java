package com.goregoreda.todolistwithwebflux.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "todos")
public class TodoEntity {
    @Id
    private Long id;
    private String title;
    private boolean completed;
}