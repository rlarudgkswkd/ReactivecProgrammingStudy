package com.example.springwebmvc.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "todos")
@Data
@Entity
public class TodoEntity {
    @Id
    private Long id;
    private String title;
    private boolean completed;
}