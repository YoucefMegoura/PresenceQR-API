package com.youcefmegoura.presenceqr.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Getter
@Setter
@Table(name = "ad_user")
public class AdUser {

    @Id
    @Column(name = "ad_user_guid", nullable = false, unique = true)
    private String adUserGuid;

    @Column(name = "isactif", nullable = false)
    private Boolean isActif;

    @Column(name = "created", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp created;

    @Column(name = "updated", nullable = false)
    @UpdateTimestamp
    private Timestamp updated;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "gender", length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ad_role_id", nullable = false)
    private AdRole adRole;

}

enum Gender {
    F, M
}
