package com.zubarev.taskmanager.repos;

import com.zubarev.taskmanager.modal.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepos extends CrudRepository<Task, Long> {

}
