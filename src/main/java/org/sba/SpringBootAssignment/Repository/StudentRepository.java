package org.sba.SpringBootAssignment.Repository;

import org.sba.SpringBootAssignment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByLastName(String lastName);
    List<Student> findAllByFirstName(String firstName);

}
