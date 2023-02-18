package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdRole;

import java.util.List;
import java.util.Optional;

/**
 * @author youcefmegoura
 * @created 14/02/2023
 */
public interface AdRoleService {
    List<AdRole> findAll();

    Optional<AdRole> findById(long id);

    AdRole save(AdRole adRole);

    void deleteById(long id);

}
