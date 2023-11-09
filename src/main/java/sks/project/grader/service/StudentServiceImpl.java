package sks.project.grader.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import sks.project.grader.data.entity.StudentEntity;
import sks.project.grader.data.model.Student;
import sks.project.grader.data.repository.StudentRepository;
import sks.project.grader.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    private static final String INVALID_STUDENT_ID = "Invalid Student id";
    final StudentRepository studentRepository;
    final MapperUtil mapperUtil;

    public StudentServiceImpl(StudentRepository studentRepository, MapperUtil mapperUtil) {
        this.studentRepository = studentRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<Student> getAllStudents() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        return studentEntities.stream().map(mapperUtil::entityToModel).collect(Collectors.toList());
    }

    @Override
    public Student getStudentById(Long sid) {
        StudentEntity studentEntity = studentRepository.findById(sid).orElseThrow(() -> new IllegalArgumentException(INVALID_STUDENT_ID));
        return mapperUtil.entityToModel(studentEntity);
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        StudentEntity studentEntity = mapperUtil.modelToEntity(student);
        studentRepository.save(studentEntity);
    }

    @Override
    @Transactional
    public Student updateStudent(Long id, Student studentDetails) {
        StudentEntity studentEntity = mapperUtil.modelToExistingEntity(studentDetails);
        return studentDetails;
    }


    @Override
    @Transactional
    public void deleteStudent(Long sid) {
        studentRepository.deleteById(sid);
    }
}
