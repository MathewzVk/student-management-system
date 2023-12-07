package com.mathewzvk.sms.controller;


import com.mathewzvk.sms.entity.Student;
import com.mathewzvk.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model theModel){
        theModel.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/students/new")
    public  String showForm(Model theModel){
        theModel.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.add(student);
        return "redirect:/students";
    }

    @GetMapping("/students/update/{id}")
    public  String showFormForUpdate(@PathVariable Integer id, Model thModel){
        Student theStudent = studentService.getStudentById(id);
        thModel.addAttribute("student", studentService.update(theStudent));
        return "add-student";
    }

    @GetMapping("/students/delete/{id}")
    public String delete(@PathVariable Integer id){
        Student theStudent = studentService.getStudentById(id);
        studentService.delete(theStudent);

        return "redirect:/students";
    }

}
