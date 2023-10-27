package edu.seminars.collection.tracker;

import edu.seminars.collection.task.Task;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

public class CommandHandler {
    private final TaskTracker taskTracker = new IndexedTaskTracker();

    private static final int ADD_TASK_ARGUMENT_INDEX_SUMMARY = 1;
    private static final int ADD_TASK_ARGUMENT_INDEX_PRIORITY = 2;
    private static final int ADD_TASK_ARGUMENT_INDEX_DEADLINE = 3;


    public String addTask(String[] args) {
        Task task = new Task(
            args[ADD_TASK_ARGUMENT_INDEX_SUMMARY],
            Integer.parseInt(args[ADD_TASK_ARGUMENT_INDEX_PRIORITY]),
            LocalDateTime.parse(args[ADD_TASK_ARGUMENT_INDEX_DEADLINE])
        );

        taskTracker.createTask(task);

        return task.getId().toString();
    }

    private static final int GET_TASK_ARGUMENT_INDEX_UUID = 1;

    public String getTask(String[] args) {
        UUID uuid = UUID.fromString(args[GET_TASK_ARGUMENT_INDEX_UUID]);

        return taskTracker.getTask(uuid).toString();
    }

    public String getHistory() {
        return taskTracker.getTaskViewHistory().stream()
            .map(Task::toString)
            .collect(Collectors.joining("\n"));
    }
}
