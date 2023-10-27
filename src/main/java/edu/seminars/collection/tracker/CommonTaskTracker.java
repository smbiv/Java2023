package edu.seminars.collection.tracker;

import edu.seminars.collection.history.CommonHistoryViewManager;
import edu.seminars.collection.task.Task;

import java.util.*;

public class CommonTaskTracker implements TaskTracker {
    private final Map<UUID, Task> tasks = new HashMap<>();
    private final CommonHistoryViewManager<UUID> viewHistory = new CommonHistoryViewManager<>();

    @Override
    public Task createTask(Task task) {
        tasks.put(task.getId(), task);

        return task;
    }

    @Override
    public Task getTask(UUID id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public void deleteTask(UUID id) {
        tasks.remove(id);
    }

    @Override
    public List<Task> getTasksByPriority() {
        return tasks.values()
                .stream()
                .sorted(Comparator.comparing(Task::getPriority))
                .toList();
    }

    @Override
    public List<Task> getTaskViewHistory() {
        return viewHistory.getViewHistory()
            .stream()
            .map(tasks::get)
            .toList();
    }
}
