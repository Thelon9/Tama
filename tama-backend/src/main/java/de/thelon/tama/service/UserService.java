package de.thelon.tama.service;

import de.thelon.tama.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final String CACHE_KEY = "User";
    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    public void saveUser(User user) {
        redisTemplate.opsForHash().put(CACHE_KEY, user.getId(), user);
    }

    public User getUser(String id) {
        return (User) redisTemplate.opsForHash().get(CACHE_KEY, id);
    }
}

