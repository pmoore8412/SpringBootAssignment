package org.sba.SpringBootAssignment.Controller;

import org.sba.SpringBootAssignment.Entity.Student;
import org.sba.SpringBootAssignment.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/enroll")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable(name = "id") long id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/student/update/{id}")
    public void updateStudent(@PathVariable long id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("/student/remove/{id}")
    public void removeStudent(@PathVariable long id) {
        studentService.removeStudent(id);
    }

}
