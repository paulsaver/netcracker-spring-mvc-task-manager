package com.zubarev.taskmanager.controllers;

import com.zubarev.taskmanager.modal.Task;
import com.zubarev.taskmanager.repos.TaskRepos;
import com.zubarev.taskmanager.service.TaskService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/getAllTasks")
    public @ResponseBody
    List<Task> getAllTasks(){
        return taskService.getAll();
    }

    @GetMapping("/getAll")
    public @ResponseBody
    String printHello(ModelMap model){
        model.addAttribute("Message","Hello Spring");
        return "hello";
    }

    @PostMapping("/addTask")
    public @ResponseBody
    Task create(@RequestBody Task task){
        return taskService.addTask(task);

    }

    @DeleteMapping("/deleteTask/{id}")
    public void delete(@PathVariable Long id){
        taskService.deleteTaskId(id);
    }

    @PutMapping("/updateTask/{id}")
    public  @ResponseBody Task updateTask(@PathVariable Long id,@RequestBody Task task){
        task.setId(id);
        return taskService.changeTask(task);
    }

    //TODO @POSTMAPPING как обработать в spring, 8java
}
