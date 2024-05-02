package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course")
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseService.create(course);
    }

    @GetMapping("/course")
    public List<Course> read() {
        return courseService.read();
    }

    @GetMapping("/course/{id}")
    public Course readById(@PathVariable String id) {
        return courseService.readById(id);
    }

    @PutMapping("/course")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Course update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping("/course")
    @ResponseStatus(HttpStatus.GONE)
    public void delete(@RequestBody Course course) {
        courseService.delete(course);
    }
}
