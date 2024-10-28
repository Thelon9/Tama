package de.thelon.tama.controller;

import de.thelon.tama.model.User;
import de.thelon.tama.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User saved!";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {

        User user;
        if(userService.getUser(id) == null){
            user = new User("404","NoUser");
        }
        else {
            user = userService.getUser(id);
        }
        return user;
    }
}
