package repository;

import entity.Todolist;

public interface TodoListRepository {

    //LOGIC = MENAMBAH, MENGHAPUS, MENDAPATKAN SEMUA DATA!
    Todolist[] getAll();

    void add(Todolist todolist);

    boolean remove(Integer number);
}
