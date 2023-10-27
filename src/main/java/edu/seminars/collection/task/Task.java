package edu.seminars.collection.task;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private UUID id;
    private String summary;
    private Integer priority;
    private TaskStatus status;

    private LocalDateTime created;

    private LocalDateTime deadline;

    public Task(String summary, Integer priority, LocalDateTime deadline) {
        this.summary = summary;
        this.priority = priority;
        this.deadline = deadline;

        this.id = UUID.randomUUID();
        this.created = LocalDateTime.now();
        this.status = TaskStatus.TODO;
    }

    public UUID getId() {
        return id;
    }

    public Integer getPriority() {
        return priority;
    }
}
