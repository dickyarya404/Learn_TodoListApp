package entity;
// MEMBUAT ENTITY
public class Todolist {

    private String todo;

    public Todolist() {
    }

    public Todolist(String todo) {
        this.todo = todo;
    }

    // GETTER UNTUK MENGUBAH DATA
    // SETTER UNTUK MENGAMBIL DATA
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
