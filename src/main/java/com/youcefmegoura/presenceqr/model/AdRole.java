package com.youcefmegoura.presenceqr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Table(name = "ad_role")
public class AdRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_role_id")
    private long adRoleId;

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
