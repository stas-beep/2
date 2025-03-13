import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати завдання");
            System.out.println("2. Видалити завдання");
            System.out.println("3. Показати всі завдання");
            System.out.println("4. Оновити завдання");
            System.out.println("5. Пошук завдання");
            System.out.println("6. Сортувати за датою");
            System.out.println("7. Вихід");
            System.out.print("Виберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    taskManager.listTasks();
                    break;
                case 4:
                    updateTask();
                    break;
                case 5:
                    searchTask();
                    break;
                case 6:
                    taskManager.sortTasks();
                    break;
                case 7:
                    System.out.println("Програма завершена.");
                    return;
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Введіть назву завдання: ");
        String title = scanner.nextLine();
        System.out.print("Введіть опис завдання: ");
        String description = scanner.nextLine();
        taskManager.addTask(title, description);
    }

    private static void deleteTask() {
        System.out.print("Введіть назву завдання для видалення: ");
        String title = scanner.nextLine();
        taskManager.deleteTask(title);
    }

    private static void updateTask() {
        System.out.print("Введіть назву завдання для оновлення: ");
        String title = scanner.nextLine();
        System.out.print("Введіть нову назву: ");
        String newTitle = scanner.nextLine();
        System.out.print("Введіть новий опис: ");
        String newDescription = scanner.nextLine();
        taskManager.updateTask(title, newTitle, newDescription);
    }

    private static void searchTask() {
        System.out.print("Введіть назву завдання для пошуку: ");
        String title = scanner.nextLine();
        taskManager.searchTask(title);
    }
}
