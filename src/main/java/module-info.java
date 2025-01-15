module jagaimogit.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.xerial.sqlitejdbc;

    opens jagaimogit.todolist to javafx.fxml;
    exports jagaimogit.todolist;
}