package com.example.demo;


import java.util.List;

public record UserRecord(
        String firstName,
        String lastName,
        String email,
        String password,
        List<Course> course) {
}
