package com.zubarev.taskmanager.repos;

import com.zubarev.taskmanager.modal.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepos extends JpaRepository<Task, Long> {
    public List<Task> findTaskByName(@Param("Name") String name);
}
