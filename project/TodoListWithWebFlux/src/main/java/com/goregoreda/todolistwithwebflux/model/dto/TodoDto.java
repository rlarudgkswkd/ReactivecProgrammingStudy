package com.goregoreda.todolistwithwebflux.model.dto;

import lombok.Data;

@Data
public class TodoDto {
    private long id;
    private String title;
    private boolean completed;
}
