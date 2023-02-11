package com.youcefmegoura.presenceqr.repository;

import com.youcefmegoura.presenceqr.model.MCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MCourseRepository extends JpaRepository<MCourse, Long> {
}

