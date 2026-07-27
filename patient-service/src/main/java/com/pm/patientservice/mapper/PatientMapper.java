package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDto;
import com.pm.patientservice.dto.PatientResponseDto;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDto toDto(Patient patient){
        PatientResponseDto patientDto = new PatientResponseDto();
        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName());
        patientDto.setAddress(patient.getAddress());
        patientDto.setEmail(patient.getEmail());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDto;
    }
    public static Patient toModel(PatientRequestDto patientrequestdto){
        Patient patient = new Patient();
        patient.setName(patientrequestdto.getName());
        patient.setAddress(patientrequestdto.getAddress());
        patient.setEmail(patientrequestdto.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientrequestdto.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientrequestdto.getRegistereddate()));
        return patient;
    }
}
