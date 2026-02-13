package az.ms_student.mapper;

import az.ms_student.dao.entity.StudentEntity;
import az.ms_student.dto.request.StudentRequest;
import az.ms_student.dto.response.StudentResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StudentMapper {
    public StudentEntity toEntity(StudentRequest request){
        return StudentEntity.builder()
                .age(request.getAge())
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }

    public StudentResponse toResponse(StudentEntity entity){
        return StudentResponse.builder()
                .id(entity.getId())
                .age(entity.getAge())
                .name(entity.getName())
                .email(entity.getEmail())
                .build();
    }

    public void updateStudent(StudentEntity entity, StudentRequest request){
        entity.setAge(request.getAge());
        entity.setName(request.getName());
        entity.setEmail(request.getEmail());
    }
}
