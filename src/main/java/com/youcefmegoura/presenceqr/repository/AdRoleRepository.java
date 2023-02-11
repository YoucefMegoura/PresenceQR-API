package com.youcefmegoura.presenceqr.repository;

import com.youcefmegoura.presenceqr.model.AdRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRoleRepository extends JpaRepository<AdRole, Long> {
    List<AdRole> findAllByIsActif(Boolean isActif);

}