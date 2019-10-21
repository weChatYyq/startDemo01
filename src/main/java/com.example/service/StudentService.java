package com.example.service;

import com.example.DTO.StudentInputDTO;
import com.example.DTO.StudentOutPutDTO;

public interface StudentService {
    StudentOutPutDTO addUser(StudentInputDTO studentInputDTO);
}
