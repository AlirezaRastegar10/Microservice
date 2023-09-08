package com.alireza.school.dto.school;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FullSchoolResponse {

    String name;
    String email;
    List<Student> students;
}
