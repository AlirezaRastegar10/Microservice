package com.alireza.student.service;


import com.alireza.student.dto.student.StudentRequest;
import com.alireza.student.dto.student.StudentResponse;
import com.alireza.student.entity.Student;
import com.alireza.student.mappers.StudentMapperImpl;
import com.alireza.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapperImpl studentMapper;

    @Override
    public StudentResponse saveStudent(StudentRequest studentRequest) {
        var student = studentMapper.studentDtoToStudent(studentRequest);
        return studentMapper.studentToDto(studentRepository.save(student));
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAllBySchoolId(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
