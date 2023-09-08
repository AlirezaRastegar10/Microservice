package com.alireza.student.controller;


import com.alireza.student.dto.student.StudentRequest;
import com.alireza.student.dto.student.StudentResponse;
import com.alireza.student.entity.Student;
import com.alireza.student.service.StudentServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentServiceImpl studentService;

    @PostMapping("/save")
    public ResponseEntity<StudentResponse> save(@RequestBody @Valid StudentRequest studentRequest) {
        return ResponseEntity.ok(studentService.saveStudent(studentRequest));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/find-all-by-school-id/{schoolId}")
    public ResponseEntity<List<Student>> findAllBySchoolId(@PathVariable Long schoolId) {
        return ResponseEntity.ok(studentService.findAllBySchoolId(schoolId));
    }
}
