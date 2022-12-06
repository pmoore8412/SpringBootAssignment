package org.sba.SpringBootAssignment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(name = "street", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    private String street;

    @Column(name = "city", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String city;

    @Column(name = "state", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String state;

    @Column(name = "zip", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String zip;


}
