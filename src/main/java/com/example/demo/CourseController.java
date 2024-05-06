package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    private final CourseRepository courseService;

    public CourseController(CourseRepository courseService) {
        this.courseService = courseService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Course> read() {
        return (List<Course>) courseService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<Course> readById(@PathVariable String id) {
        return courseService.findById(id);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Course update(@RequestBody Course course) {
        return courseService.save(course);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Course course) {
        courseService.delete(course);
    }
}
