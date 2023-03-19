import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 * Menu
 */
public class Menu {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public static void display() {

        Scanner scanner = new Scanner(System.in, "CP866");
        TaskList taskList = new TaskList();
        int choice;
        do {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Задачи с заданным приоритетом");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Список задач");
            System.out.println("5. Экспорт задач в файл");
            System.out.println("6. Импорт задач из файла");
            System.out.println("7. Выход");
            System.out.print(":> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя автора:");
                    String name = scanner.nextLine();
                    System.out.println("Введите описание задачи:");
                    String description = scanner.nextLine();
                    System.out.print("Введите приоритет задачи (высокий, средний, низкий): ");
                    Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Введите дату и время начала выполнения задачи в формате \"dd.MM.yyyy HH:mm\" : ");
                    LocalDateTime startDateTime = LocalDateTime.parse(scanner.nextLine(), format);
                    System.out.print("Введите дату и время окончания выполнения задачи в формате \"dd.MM.yyyy HH:mm\" : ");
                    LocalDateTime endDateTime = LocalDateTime.parse(scanner.nextLine(), format);
                    taskList.addTask(new Task(name, description, priority, startDateTime, endDateTime));
                    break;
                case 2:
                    System.out.println("Введите приоритет для поиска: ");
                    Priority priorit = Priority.valueOf(scanner.nextLine().toUpperCase());
                    List<Task> getPriority = taskList.getTasksByPriority(priorit);
                    if(getPriority.isEmpty()){
                        System.out.println("Задачи не найдены.");
                    }else{
                        for (Task temp  : getPriority) {
                            System.out.println(temp);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите ID задачи для удаления");
                    int delID = scanner.nextInt();
                    taskList.deleteTaskID(delID);
                    break;
                case 4:
                    taskList.printTasks();
                    break;
                case 5:
                    System.out.println("Введите имя файла для экспорта данных:");
                    String fileName = scanner.nextLine();
                    taskList.exportToCSV(fileName);
                    break;
                case 6:
                    System.out.println("Введите имя файла для импорта данных:");
                    String fileNam = scanner.nextLine();
                    taskList.importFromCSV(fileNam);
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }

}