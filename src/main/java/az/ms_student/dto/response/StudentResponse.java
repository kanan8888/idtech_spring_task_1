package az.ms_student.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StudentResponse {
    private Long id;
    private int age;
    private String name;
    private String email;
}
