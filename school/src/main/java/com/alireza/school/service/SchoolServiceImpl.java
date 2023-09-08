package com.alireza.school.service;


import com.alireza.school.client.StudentClient;
import com.alireza.school.dto.school.FullSchoolResponse;
import com.alireza.school.dto.school.SchoolRequest;
import com.alireza.school.dto.school.SchoolResponse;
import com.alireza.school.entity.School;
import com.alireza.school.exceptions.school.SchoolNotFoundException;
import com.alireza.school.mappers.SchoolMapperImpl;
import com.alireza.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolMapperImpl schoolMapper;
    private final StudentClient studentClient;

    @Override
    public SchoolResponse saveSchool(SchoolRequest schoolRequest) {
        var school = schoolMapper.schoolDtoToSchool(schoolRequest);
        return schoolMapper.schoolToDto(schoolRepository.save(school));
    }

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public FullSchoolResponse findAllWithStudent(Long schoolId) {
        var school = schoolRepository.findById(schoolId).orElseThrow(
                () -> new SchoolNotFoundException("no school found with this id: " + schoolId)
        );
        var student = studentClient.findAllBySchoolId(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(student)
                .build();
    }
}
