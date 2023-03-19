import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Serializable {
    transient private static AtomicInteger idCounter = new AtomicInteger(0);
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private int id;
    private String name;
    private String description;
    private Priority priority;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public Task(String name, String description, Priority priority, LocalDateTime startDateTime,
            LocalDateTime endDateTime) {
        this.id = idCounter.addAndGet(1);
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nописание: '" + description + '\'' +
                "\nначало: " + startDateTime.format(format) +
                "\nконец: " + endDateTime.format(format) +
                "\nприоритет: " + priority +
                "\nимя автора: '" + name + '\'';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}