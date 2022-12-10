package org.sba.SpringBootAssignment.Controller;

import org.sba.SpringBootAssignment.Entity.Courses;
import org.sba.SpringBootAssignment.Service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @PostMapping("/course")
    public void addCourse(Courses course) {
        coursesService.addCourse(course);
    }

    @GetMapping("/course/{id}")
    public Courses getCourse(String id) {
        return coursesService.getCourse(id);
    }

    @GetMapping("/courses")
    public List<Courses> getAllCourses() {
        return coursesService.getAllCourses();
    }

    @PutMapping("/update/course/{id}")
    public void updateCourses(String id, Courses newCourse) {
        coursesService.updateCourses(id, newCourse);
    }

    @DeleteMapping("/remove/course/{id}")
    public void removeCourse(String id) {
        coursesService.removeCourse(id);
    }

}
