package com.app.business;

import java.util.ArrayList;
import java.util.List;

import com.app.service.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		//We will get the List<Todo>
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			//Filter them & Stored in filteredTodos
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
