package org.example.example.model.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    private String id;
    private String CourseCode;
    private String CourseTitle;
    private String CourseDescription;

    @OneToMany(mappedBy = "course") // Specify the mappedBy attribute
    private List<Course> students;
}
