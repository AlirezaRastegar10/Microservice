package com.alireza.student.dto.student;


import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRequest {

    @NotBlank(message = "firstname cannot be empty.")
    @Size(min = 3, message = "firstname should have at least 3 characters.")
    @Pattern(regexp = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-])*$", message = "firstname can not have number and sign(!,@,#,%,...).")
    String firstname;

    @NotBlank(message = "lastname cannot be empty.")
    @Size(min = 3, message = "lastname should have at least 3 characters.")
    @Pattern(regexp = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-])*$", message = "lastname can not have number and sign(!,@,#,%,...).")
    String lastname;

    @NotBlank(message = "email cannot be empty.")
    @Email(message = "the email pattern is incorrect.")
    String email;

    @NotNull(message = "school id cannot be empty.")
    Long schoolId;
}
