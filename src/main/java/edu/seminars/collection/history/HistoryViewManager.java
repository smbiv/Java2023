package edu.seminars.collection.history;

import java.util.List;

public interface HistoryViewManager<T> {
    void addTask(T task);

    List<T> getViewHistory();
}
