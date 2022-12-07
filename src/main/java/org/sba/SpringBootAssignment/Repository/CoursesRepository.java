package org.sba.SpringBootAssignment.Repository;

import org.sba.SpringBootAssignment.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, String> {

    List<Courses> findAllByInstructor(String instructor);
    List<Courses> findAllByCost(double cost);
    List<Courses> findAllByName(String name);

}
