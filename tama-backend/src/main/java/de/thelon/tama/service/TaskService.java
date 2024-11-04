package de.thelon.tama.service;

import de.thelon.tama.model.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TaskService {
    private static final String CACHE_KEY = "Task";
    @Autowired
    private RedisTemplate<String, Task> redisTemplate;

    public void saveTask(Task task) {
        redisTemplate.opsForHash().put(CACHE_KEY, task.getId(), task);
    }

    public Task getTask(String id) {
        return (Task) redisTemplate.opsForHash().get(CACHE_KEY, id);
    }
}

