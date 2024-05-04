package com.example.springRest.repository;

import com.example.springRest.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> { // сущность с кем работать, тип айдишщника
}
