package org.sba.SpringBootAssignment.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String id;

    @Column(name = "course_name", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "instructor", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String instructor;

    @Column(name = "cost", nullable = false)
    @JdbcTypeCode(SqlTypes.DOUBLE)
    private double cost;

    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    private String description;

}
