package sks.project.grader.util;

import org.springframework.stereotype.Component;
import sks.project.grader.data.entity.StudentEntity;
import sks.project.grader.data.model.Student;

@Component
public class MapperUtil {
    public Student entityToModel(StudentEntity studentEntity) {
        return Student.fromStudentEntity(studentEntity);
    }
    public StudentEntity modelToEntity(Student student) {
        return StudentEntity.fromStudent(student);
    }

//    public StudentEntity modelToExistingEntity(Student student) {
//        return new StudentEntity(student.getSid(),student.getNetId(),student.getName(),student.getEmail());
//    }
}
