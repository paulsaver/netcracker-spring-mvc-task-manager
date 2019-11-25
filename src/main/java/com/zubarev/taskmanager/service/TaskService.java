package com.zubarev.taskmanager.service;

import com.zubarev.taskmanager.modal.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface TaskService {
    public Task addTask(Task task);
    public void deleteTask(Task task);
    public Task changeTask(Task task);
    public List<Task> getAll();
    public Task getTask(Long id);
    public void deleteTaskId(Long id);
}
