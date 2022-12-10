package org.sba.SpringBootAssignment.Service;

import org.sba.SpringBootAssignment.Entity.Courses;
import org.sba.SpringBootAssignment.Repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;

    public void addCourse(Courses courses) {
        coursesRepository.save(courses);
    }

    public Courses getCourse(String id) {
        return coursesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Course not found with id: " + id));
    }

    public List<Courses> getAllCourses() {
        return coursesRepository.findAll().stream().collect(Collectors.toList());
    }

    public void updateCourses(String id, Courses newCourse) {
        Courses oldCourse = coursesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Course not found with id: " + id));

        oldCourse.setId(newCourse.getId());
        oldCourse.setName(newCourse.getName());
        oldCourse.setCost(newCourse.getCost());
        oldCourse.setInstructor(newCourse.getInstructor());
        oldCourse.setDescription(newCourse.getDescription());

        coursesRepository.save(oldCourse);
    }

    public void removeCourse(String id) {
        Courses course = coursesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Course not found with id: " + id));

        coursesRepository.delete(course);
    }

}
