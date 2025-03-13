import java.util.*;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        Task task = new Task(title, description, new Date());
        tasks.add(task);
        System.out.println("Завдання додано!");
    }

    public void deleteTask(String title) {
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
        System.out.println("Завдання видалено (якщо існувало).");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список завдань порожній.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task + "\n-------------------");
        }
    }

    public void updateTask(String title, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                System.out.println("Завдання оновлено!");
                return;
            }
        }
        System.out.println("Завдання не знайдено.");
    }

    public void searchTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Знайдено: \n" + task);
                return;
            }
        }
        System.out.println("Завдання не знайдено.");
    }

    public void sortTasks() {
        tasks.sort(Comparator.comparing(Task::getDateTime));
        System.out.println("Список завдань відсортовано за датою.");
    }
}
