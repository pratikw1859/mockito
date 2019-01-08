package com.app.business;

import java.util.ArrayList;
import java.util.List;

import com.app.service.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;

	

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}



	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
