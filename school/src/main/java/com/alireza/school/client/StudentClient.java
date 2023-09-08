package com.alireza.school.client;


import com.alireza.school.dto.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/find-all-by-school-id/{schoolId}")
    List<Student> findAllBySchoolId(@PathVariable("schoolId") Long schoolId);
}
