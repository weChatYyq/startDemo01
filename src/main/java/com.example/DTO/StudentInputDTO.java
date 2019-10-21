package com.example.DTO;

import com.example.entity.Student;
import com.example.utils.DTOConvert;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class StudentInputDTO {
    private String username;
    private int age;

    public Student convertToStudent() {
        StudentInputDTOConvert studentInputDTOConvert = new StudentInputDTOConvert();
        Student convert = studentInputDTOConvert.doForward(this);
        return convert;
    }

    public StudentInputDTO convertFor(Student student) {
//        StudentInputDTOConvert studentInputDTOConvert = new StudentInputDTOConvert();
//        StudentInputDTO studentInputDTO = studentInputDTOConvert.doBackward(student);
//        return studentInputDTO;
        throw new AssertionError("不支持逆向转化方法!");
    }

    private static class StudentInputDTOConvert implements DTOConvert<StudentInputDTO, Student> {
        @Override
        public Student doForward(StudentInputDTO studentInputDTO) {
            Student user = new Student();
            BeanUtils.copyProperties(studentInputDTO, user);
            return user;
        }

        @Override
        public StudentInputDTO doBackward(Student student) {
            StudentInputDTO studentInputDTO = new StudentInputDTO();
            BeanUtils.copyProperties(student, studentInputDTO);
            return studentInputDTO;
        }
    }
}
