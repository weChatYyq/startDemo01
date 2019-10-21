package com.example.DTO;

import com.example.entity.Student;
import com.example.utils.DTOConvert;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class StudentOutPutDTO {
    private String username;
    private int age;

    public Student convertToStudent() {
        StudentOutPutDTOConvert studentOutPutDTOConvert = new StudentOutPutDTOConvert();
        Student convert = studentOutPutDTOConvert.doForward(this);
        return convert;
    }

    public StudentOutPutDTO convertFor(Student student) {
        StudentOutPutDTOConvert studentOutPutDTOConvert = new StudentOutPutDTOConvert();
        StudentOutPutDTO studentOutPutDTO = studentOutPutDTOConvert.doBackward(student);
        return studentOutPutDTO;
    }

    private static class StudentOutPutDTOConvert implements DTOConvert<StudentOutPutDTO, Student> {
        @Override
        public Student doForward(StudentOutPutDTO studentOutPutDTO) {
            Student student = new Student();
            BeanUtils.copyProperties(studentOutPutDTO, student);
            return student;
        }

        @Override
        public StudentOutPutDTO doBackward(Student student) {
            StudentOutPutDTO studentOutputDTO = new StudentOutPutDTO();
            BeanUtils.copyProperties(student, studentOutputDTO);
            return studentOutputDTO;
        }
    }
}
