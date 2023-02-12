package com.youcefmegoura.presenceqr.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_course")
public class MCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_course_id")
    private long id;

    @Column(name = "isactif", nullable = false)
    private Boolean isActif;

    @Column(name = "created", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp created;

    @Column(name = "updated", nullable = false)
    @UpdateTimestamp
    private Timestamp updated;

    @Column(name = "name")
    private String name;

}