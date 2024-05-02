package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
}