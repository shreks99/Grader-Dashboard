package sks.project.grader.service;

import sks.project.grader.data.model.Student;

import java.util.List;


public interface StudentService {
    void createStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
