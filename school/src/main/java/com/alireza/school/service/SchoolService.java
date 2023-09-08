package com.alireza.school.service;

import com.alireza.school.dto.school.FullSchoolResponse;
import com.alireza.school.dto.school.SchoolRequest;
import com.alireza.school.dto.school.SchoolResponse;
import com.alireza.school.entity.School;

import java.util.List;

public interface SchoolService {

    SchoolResponse saveSchool(SchoolRequest schoolRequest);
    List<School> findAll();

    FullSchoolResponse findAllWithStudent(Long schoolId);
}
