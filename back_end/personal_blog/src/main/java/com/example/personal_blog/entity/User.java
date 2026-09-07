package com.example.personal_blog.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Long id;
    private String username = "";
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
