module jagaimogit.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens jagaimogit.todolist to javafx.fxml;
    exports jagaimogit.todolist;
}