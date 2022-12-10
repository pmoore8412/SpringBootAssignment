package org.sba.SpringBootAssignment.Service;

import org.sba.SpringBootAssignment.Entity.Student;
import org.sba.SpringBootAssignment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "No student found with id: " + id));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll().stream().collect(Collectors.toList());
    }

    public void updateStudent(long id, Student newStudent) {
        Student oldStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "No student found with id: " + id));

        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setMiddleName(newStudent.getMiddleName());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setPhoneNumber(newStudent.getPhoneNumber());

        studentRepository.save(oldStudent);
    }

    public void removeStudent(long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "No student found with id: " + id));

        studentRepository.delete(student);
    }

}
