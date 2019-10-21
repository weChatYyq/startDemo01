package com.example.service.impl;

import com.example.DTO.StudentInputDTO;
import com.example.DTO.StudentOutPutDTO;
import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentOutPutDTO addUser(StudentInputDTO studentInputDTO) {
        StudentOutPutDTO studentOutPutDTO = new StudentOutPutDTO();
        Student student = studentInputDTO.convertToStudent();
//      操作数据库
//      Student stu = mapper.addStudent(student)

//      返回值convert
        studentOutPutDTO = studentOutPutDTO.convertFor(student);
        return studentOutPutDTO;
    }
}
