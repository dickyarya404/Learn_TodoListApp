package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListService.addTodolist("Belajar java basic");
        todoListService.addTodolist("Belajar java oop");
        todoListService.addTodolist("Belajar java unit test");


        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListView.addTodoList();

        todoListService.showTodoList();

        todoListView.addTodoList();

        todoListService.showTodoList();


    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListService.addTodolist("Belajar java basic");
        todoListService.addTodolist("Belajar java oop");
        todoListService.addTodolist("Belajar java unit test");


        todoListService.showTodoList();

        todoListView.removeTodoList();

        todoListService.showTodoList();
    }

}
