package com.youcefmegoura.presenceqr.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "ad_role")
@Getter
@Setter
@Entity
public class AdRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_role_id")
    private int adRoleId;

    @Column(name = "isactif", nullable = false)
    private Boolean isActif;

    @Column(name = "created", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp created;

    @Column(name = "updated", nullable = false)
    @UpdateTimestamp
    private Timestamp updated;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

}
