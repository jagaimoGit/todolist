package jagaimogit.todolist.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Task {
    private String task;
    private String date;
    public Task(String task, long date) {
        this.task = task;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(date));
    }

    public String getTask() {
        return task;
    }

    public String getDate() {
        return date;
    }
}
