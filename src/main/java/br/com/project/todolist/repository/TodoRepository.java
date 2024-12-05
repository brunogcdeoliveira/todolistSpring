package br.com.project.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
