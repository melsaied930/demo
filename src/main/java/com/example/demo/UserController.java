package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserRepository userService;

    public UserController(UserRepository userService) {
        this.userService = userService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<User> read() {
        return (List<User>) userService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> readById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PutMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User update(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }
}
