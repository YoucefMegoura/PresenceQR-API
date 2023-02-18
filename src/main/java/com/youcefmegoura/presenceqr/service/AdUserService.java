package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdUser;

import java.util.List;
import java.util.Optional;

/**
 * @author youcefmegoura
 * @created 14/02/2023
 */
public interface AdUserService {
    List<AdUser> findAll();

    Optional<AdUser> findById(String id);

    Optional<AdUser> findByEmail(String email);

    AdUser save(AdUser adUser);

    void deleteById(String id);
}
