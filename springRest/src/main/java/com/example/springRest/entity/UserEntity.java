package com.example.springRest.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity //таблица бд
public class UserEntity  {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user") // all - если удаляется пользователь то и его записи тоже
    private List<TodoEntity> todos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public UserEntity(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public List<TodoEntity> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoEntity> todos) {
        this.todos = todos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
