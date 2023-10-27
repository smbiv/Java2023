package edu.seminars.collection.history;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class CommonHistoryViewManager<T> implements HistoryViewManager<T> {
    private LinkedHashSet<T> history = new LinkedHashSet<>();

    @Override
    public void addTask(T task) {
        history.remove(task);
        history.add(task);
    }

    @Override
    public List<T> getViewHistory() {
        return new ArrayList<>(history);
    }
}
