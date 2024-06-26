package com.example.springRest.model;

import com.example.springRest.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class User {

    private Long id;
    private String username;
    private List<Todo> todos;

    public static User toModel(UserEntity entity) {// создаем модель через ентити
        User model = new User();
        model.setId(entity.getId());
        model.getUsername(entity.getUsername());

        // преобразовывание массива ентити в массив моделей
        model.setTodos(entity.getTodos().stream().map(Todo::toModel).collect(Collectors.toList()));
        return model;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername(String username) {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
