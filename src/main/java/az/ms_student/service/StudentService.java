package az.ms_student.service;

import az.ms_student.dto.request.StudentRequest;
import az.ms_student.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {
    void addStudent(StudentRequest studentRequest);
    void deleteStudent(Long studentId);
    void updateStudent(Long studentId, StudentRequest request);
    StudentResponse getStudentById(Long studentId);
    List<StudentResponse> getAllStudents();
}
