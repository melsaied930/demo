package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "DEMO\".\"COURSE")
public record Course
        (
                @Id @Column("ID") String id,
                @Column("NAME") String name,
                @Column("DESCRIPTION") String description
        ) {
}