package com.example.springwebmvc.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class TodoDto {
    private long id;

    private String title;

    private boolean completed;
}
