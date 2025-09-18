package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;



// Annotated with @Entity + @Table → makes this class map to students table.
// @Id + @GeneratedValue → auto-increment primary key.

// Validations:
// @NotBlank for name/email.
// @Size for name length.
// @Email ensures valid email.
// @Min / @Max ensures age is between 18–60.

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is Required ")
    @Size(min=3, max = 50, message="Name should be between 3 to 50 letters long ")
    private String name;

    @Email(message = "EMail must be valid")
    @NotBlank(message = "Email is required")
    @Column(unique = true, nullable = false)
    private String email;

    @Min(value = 18, message="Age must be above 18")
    @Max(value=30, message = "Age must be under 30")
    private Integer age;

    // Required no-args constructor (for JPA)
    public Student() {}

    public Student(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}



