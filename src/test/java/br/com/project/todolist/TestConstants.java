package br.com.project.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.project.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "teste", "Curtir", false, 1));
      add(new Todo(9996L, "teste", "Comentar", false, 1));
      add(new Todo(9997L, "teste", "Compartilhar", false, 1));
      add(new Todo(9998L, "teste", "Se Inscrever", false, 1));
      add(new Todo(9999L, "teste", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
