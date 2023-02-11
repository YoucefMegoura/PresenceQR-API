package com.youcefmegoura.presenceqr.repository;

import com.youcefmegoura.presenceqr.model.AdRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRoleRepository extends JpaRepository<AdRole, Long> {
}