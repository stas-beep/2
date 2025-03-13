import java.util.*;

public class Task {
    private String title;
    private String description;
    private Date dateTime;

    public Task(String title, String description, Date dateTime) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Завдання: " + title + "\nОпис: " + description + "\nДата: " + dateTime;
    }
}
