package edu.seminars.collection.tracker;

import edu.seminars.collection.task.Task;

import java.util.List;
import java.util.UUID;

public interface TaskTracker {
    Task createTask(Task task);
    Task getTask(UUID id);

    List<Task> getAllTasks();

    void deleteTask(UUID id);

    List<Task> getTasksByPriority();

    List<Task> getTaskViewHistory();
}
