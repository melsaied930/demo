package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/user")
    public List<User> read() {
        return userService.read();
    }

    @GetMapping("/user/{id}")
    public User readById(@PathVariable String id) {
        return userService.readById(id);
    }

    @PutMapping("/user")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/user")
    @ResponseStatus(HttpStatus.GONE)
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }
}
