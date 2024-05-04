package com.example.springRest.service;

import com.example.springRest.entity.TodoEntity;
import com.example.springRest.entity.UserEntity;
import com.example.springRest.model.Todo;
import com.example.springRest.repository.TodoRepo;
import com.example.springRest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo completeTodo(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted()); //отрицание  у того что сейчас стоит, а стоит не выполнено
        return Todo.toModel(todoRepo.save(todo));
    }
}
