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
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private long id;

    @Column(name = "home", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int home;

    @Column(name = "cell", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int cell;

}
