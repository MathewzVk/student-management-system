package com.mathewzvk.sms.service;

import com.mathewzvk.sms.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student add(Student theStudent);

    public Student getStudentById(Integer id);

    public  Student update(Student theStudent);

    public  void delete(Student theStudent);

}
