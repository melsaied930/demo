package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("DEMO\".\"USER")
public record User
        (
                @Id @Column("ID") Long id,
                @Column("FIRSTNAME") String firstName,
                @Column("LASTNAME") String lastName,
                @Column("EMAIL") String email,
                @Column("LASTNAME") String password
        ) {
}
