package sks.project.grader.service;

import org.springframework.stereotype.Service;
import sks.project.grader.data.model.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Student createStudent(Student Student) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
