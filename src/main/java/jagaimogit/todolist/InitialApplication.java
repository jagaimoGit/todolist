package jagaimogit.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InitialApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(new FXMLLoader(getClass().getResource("initialApp.fxml")).load()));
        stage.setTitle("TodoList");
        stage.show();
    }
}
