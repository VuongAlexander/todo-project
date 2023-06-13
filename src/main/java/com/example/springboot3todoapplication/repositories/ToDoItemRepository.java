package com.example.springboot3todoapplication.repositories;

import com.example.springboot3todoapplication.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
}
