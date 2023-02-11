package com.youcefmegoura.presenceqr.repository;

import com.youcefmegoura.presenceqr.model.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdUserRepository extends JpaRepository<AdUser, String> {
}
