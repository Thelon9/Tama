package de.thelon.tama.controller;

import de.thelon.tama.model.Task;
import de.thelon.tama.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Object> saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
        return new ResponseEntity<>(null,HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable String id) {
        return new ResponseEntity<>(taskService.getTask(id), HttpStatus.OK);
    }
}
