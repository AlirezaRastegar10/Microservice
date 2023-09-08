package com.alireza.school.mappers;

import com.alireza.school.dto.school.SchoolRequest;
import com.alireza.school.dto.school.SchoolResponse;
import com.alireza.school.entity.School;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SchoolMapper {

    @Mapping(target = "id", ignore = true)
    School schoolDtoToSchool(SchoolRequest schoolRequest);

    SchoolResponse schoolToDto(School school);
}
