package com.goregoreda.todolistwithwebflux.model.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class TodoDto {
    private Long id;
    private String title;
    private boolean completed;
}
