package jagaimogit.todolist;

import jagaimogit.todolist.utils.Connector;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class InitialAppController implements Initializable {
    // SQL Connections
    Connection con;

    // Tab setups
    int subTab;
    int mainTab;


    public void add(){

    }
    public void remove() {

    }
    public void edit() {

    }
    public void change() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.mainTab = 0;
        this.subTab = 0;
        Connector.initialize();
        this.con = Connector.getConnection();
    }

    public void changeMainTab(Event event) {
        TabPane tabs = (TabPane) event.getSource();
        if (mainTab != tabs.getSelectionModel().getSelectedIndex()) {
            mainTab = tabs.getSelectionModel().getSelectedIndex();
            String[] arr = {"Tasks", "Settings"};
            System.out.println("Main tab changed to: " + mainTab + ".) " + arr[mainTab]);
        }
    }

    public void changeSubTab(Event event) {
        TabPane tabs = (TabPane) event.getSource();
        if (subTab != tabs.getSelectionModel().getSelectedIndex()) {
            subTab = tabs.getSelectionModel().getSelectedIndex();
            String[] arr = {"High", "Normal", "Low"};
            System.out.println("Subtab changed to: " + subTab + ".) " + arr[subTab]);
        }
    }
}
