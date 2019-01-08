package com.app.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import com.app.business.TodoBusinessImpl;
import com.app.service.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring() {
		TodoService todoServiceMock= mock(TodoService.class);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todos = businessImpl
				.retrieveTodosRelatedToSpring("PRATIK");
		assertEquals(2, todos.size());
	}

}
