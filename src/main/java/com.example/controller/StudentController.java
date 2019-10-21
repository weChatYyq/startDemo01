package com.example.controller;

import com.example.DTO.StudentInputDTO;
import com.example.DTO.StudentOutPutDTO;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentOutPutDTO addUser(@RequestBody StudentInputDTO studentInputDTO) {
        return studentService.addUser(studentInputDTO);
    }
}
