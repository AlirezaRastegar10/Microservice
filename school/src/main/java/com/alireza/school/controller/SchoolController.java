package com.alireza.school.controller;


import com.alireza.school.dto.school.FullSchoolResponse;
import com.alireza.school.dto.school.SchoolRequest;
import com.alireza.school.dto.school.SchoolResponse;
import com.alireza.school.entity.School;
import com.alireza.school.service.SchoolServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolServiceImpl schoolService;

    @PostMapping("/save")
    public ResponseEntity<SchoolResponse> save(@RequestBody @Valid SchoolRequest schoolRequest) {
        return ResponseEntity.ok(schoolService.saveSchool(schoolRequest));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<School>> findAll() {
        return ResponseEntity.ok(schoolService.findAll());
    }

    @GetMapping("/find-with-student/{schoolId}")
    public ResponseEntity<FullSchoolResponse> findAllWithStudent(@PathVariable Long schoolId) {
        return ResponseEntity.ok(schoolService.findAllWithStudent(schoolId));
    }
}
