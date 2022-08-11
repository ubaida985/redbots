package com.redhatbots.studentsystem.service;

import com.redhatbots.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
