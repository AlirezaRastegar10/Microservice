package com.alireza.school.dto.school;


import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolRequest {

    @NotBlank(message = "name cannot be empty.")
    @Size(min = 3, message = "name should have at least 3 characters.")
    @Pattern(regexp = "(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-])*$", message = "name can not have number and sign(!,@,#,%,...).")
    String name;

    @NotBlank(message = "email cannot be empty.")
    @Email(message = "the email pattern is incorrect.")
    String email;
}
