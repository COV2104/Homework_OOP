import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByPriority(Priority priority) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equals(priority)) {
                result.add(task);
            }
        }
        return result;
    }

    public void deleteTaskID(int delID) {
        tasks.remove(delID-1);
        System.out.println("Удаление завершено");
    }

    public void printTasks() {
        Iterator<Task> tIterator = tasks.iterator();
        if (tasks.isEmpty()) {
            System.out.println("Задачи не найдены.");
        } else {
            while (tIterator.hasNext()) {
                System.out.println(tIterator.next());
            }
        }
    }

    public void exportToCSV(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.append("ID,Name,Description,Priority,Start Date,End Date\n");
            for (Task task : tasks) {
                writer.append(task.getId() + "," + task.getName() + "," + task.getDescription() + ","
                        + task.getPriority() + "," + task.getStartDateTime() + ","
                        + task.getEndDateTime() + "\n");
            }
            writer.close();
            System.out.println("Экспорт завершен");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Task> importFromCSV(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            boolean firstLine = true;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                String name = values[1];
                String description = values[2];
                Priority priority = Priority.valueOf(values[3]);
                LocalDateTime startDateTime = LocalDateTime.parse(values[4]);
                LocalDateTime endDateTime = LocalDateTime.parse(values[5]);

                Task task = new Task(name, description, priority, startDateTime, endDateTime);
                tasks.add(task);
            }
            bufferedReader.close();
            reader.close();
            System.out.println("Импорт завершен");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

}
