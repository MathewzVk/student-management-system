package com.mathewzvk.sms.repo;

import com.mathewzvk.sms.entity.Student;
import com.mathewzvk.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(Student theStudent) {
        return studentRepository.save(theStudent);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student update(Student theStudent) {
        return studentRepository.save(theStudent);
    }

    @Override
    public void delete(Student theStudent) {
        studentRepository.delete(theStudent);
    }
}
