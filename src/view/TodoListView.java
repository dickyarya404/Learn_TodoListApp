package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){

        while (true) {
            todoListService.showTodoList();
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("x. Keluar");
            System.out.println("-------------------");


            var input = InputUtil.input("Pilih");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan Tidak Dimengerti");
                System.out.println("-------------------");
            }
        }

    }

    public void addTodoList(){
        System.out.println("Silahkkan Menambahkan Data Todolist");
        var todo = InputUtil.input("Todo(Ketik x Jika Batal");

        if (todo.equals("x")) {
            // batal
        } else {
            todoListService.addTodolist(todo);
        }

    }


    public void removeTodoList(){
        System.out.println("Silahkkan Menghapus Data Todolist");
        var number = InputUtil.input("Nomor yang dihapus(x Jika Batal");

        if (number.equals("x")) {
            //batal
        } else {
             todoListService.removeTodoList(Integer.valueOf(number));
        }

    }
}

