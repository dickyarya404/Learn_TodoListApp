package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java Dasar");
        todoListRepository.data[1] = new Todolist("Belajar Java OOP");
        todoListRepository.data[2] = new Todolist("Belajar Java Standar Class");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodolist("Belajar Java Basic");
        todoListService.addTodolist("Belajar Java OOP");
        todoListService.addTodolist("Belajar Java lamda");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodolist("Belajar Java Basic");
        todoListService.addTodolist("Belajar Java OOP");
        todoListService.addTodolist("Belajar Java lamda");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(1);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
    }


}

