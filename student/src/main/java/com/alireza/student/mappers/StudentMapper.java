package com.alireza.student.mappers;

import com.alireza.student.dto.student.StudentRequest;
import com.alireza.student.dto.student.StudentResponse;
import com.alireza.student.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "id", ignore = true)
    Student studentDtoToStudent(StudentRequest studentRequest);

    StudentResponse studentToDto(Student student);
}
