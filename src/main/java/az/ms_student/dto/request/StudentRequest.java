package az.ms_student.dto.request;

import lombok.Data;

@Data
public class StudentRequest {
    private Long id;
    private int age;
    private String name;
    private String email;
}
