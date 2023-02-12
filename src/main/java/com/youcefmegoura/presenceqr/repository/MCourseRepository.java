package com.youcefmegoura.presenceqr.repository;

import com.youcefmegoura.presenceqr.model.MCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Repository
public interface MCourseRepository extends JpaRepository<MCourse, Long> {
    List<MCourse> findAllByIsActif(Boolean isActif);
}

