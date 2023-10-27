package edu.seminars.collection.tracker;

import com.sun.source.tree.Tree;
import edu.seminars.collection.history.CommonHistoryViewManager;
import edu.seminars.collection.task.Task;

import java.util.*;

public class IndexedTaskTracker implements TaskTracker {
    private final Map<UUID, Task> tasks = new HashMap<>();
    private final CommonHistoryViewManager<UUID> viewHistory = new CommonHistoryViewManager<>();

    private final TreeSet<Task> priorityTasks = new TreeSet<>(Comparator.comparing(Task::getPriority));

    @Override
    public Task createTask(Task task) {
        tasks.put(task.getId(), task);
        priorityTasks.add(task);
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
        priorityTasks.remove(tasks.get(id));
    }

    @Override
    public List<Task> getTasksByPriority() {
        return new ArrayList<>(priorityTasks);
    }

    @Override
    public List<Task> getTaskViewHistory() {
        return viewHistory.getViewHistory()
            .stream()
            .map(tasks::get)
            .toList();
    }
}
