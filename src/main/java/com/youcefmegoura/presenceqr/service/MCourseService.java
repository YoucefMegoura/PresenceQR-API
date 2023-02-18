package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.MCourse;

import java.util.List;

/**
 * @author youcefmegoura
 * @created 14/02/2023
 */
public interface MCourseService {
    List<MCourse> findAll();

    MCourse findById(Long id);

    MCourse save(MCourse mCourse);

    void deleteById(Long id);
}
