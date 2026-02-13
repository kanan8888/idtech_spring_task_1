package az.ms_student.service.impl;

import az.ms_student.dto.request.StudentRequest;
import az.ms_student.dto.response.StudentResponse;
import az.ms_student.mapper.StudentMapper;
import az.ms_student.dao.repository.StudentRepository;
import az.ms_student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public void addStudent(StudentRequest request) {
        System.out.println(">>> StudentServiceImpl.addStudent started ");

        studentRepository.save(
                StudentMapper.toEntity(request)
        );

        System.out.println("<<< StudentServiceImpl.addStudent ended");
    }

    @Override
    public void deleteStudent(Long studentId) {
        System.out.println(">>> StudentServiceImpl.deleteStudent started");

        var student = studentRepository.findById(studentId)
                .orElseThrow(()-> new RuntimeException("Student not found"));
        studentRepository.delete(student);

        System.out.println("<<< StudentServiceImpl.deleteStudent ended");
    }

    @Override
    public void updateStudent(Long studentId, StudentRequest request) {
        System.out.println(">>> StudentServiceImpl.updateStudent started");

        var student = studentRepository.findById(studentId)
                .orElseThrow(()-> new RuntimeException("Student not found"));
        StudentMapper.updateStudent(student, request);
        studentRepository.save(student);

        System.out.println("<<< StudentServiceImpl.updateStudent ended");
    }

    @Override
    public StudentResponse getStudentById(Long studentId) {
        System.out.println(">>> StudentServiceImpl.getStudentById started");
        var student = studentRepository.findById(studentId)
                .orElseThrow(()-> new RuntimeException("Student not found"));
        var response = StudentMapper.toResponse(student);
        System.out.println("<<< StudentServiceImpl.getStudentById started");
        return response;
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        System.out.println(">>> StudentServiceImpl.getAllStudents started");
        var response = studentRepository.findAll().stream()
                .map(StudentMapper::toResponse)
                .toList();
        System.out.println("<<< StudentServiceImpl.getAllStudents started");
        return response;
    }
}
