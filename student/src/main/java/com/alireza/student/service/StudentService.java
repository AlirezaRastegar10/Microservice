package com.alireza.student.service;

import com.alireza.student.dto.student.StudentRequest;
import com.alireza.student.dto.student.StudentResponse;
import com.alireza.student.entity.Student;

import java.util.List;

public interface StudentService {

    StudentResponse saveStudent(StudentRequest studentRequest);
    List<Student> findAll();

    List<Student> findAllBySchoolId(Long schoolId);
}
