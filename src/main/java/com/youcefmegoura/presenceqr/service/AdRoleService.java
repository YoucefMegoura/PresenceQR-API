package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdRole;
import com.youcefmegoura.presenceqr.repository.AdRoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdRoleService {
    //TODO:: add logger
    private final AdRoleRepository adRoleRepository;

    public List<AdRole> findAll() {
        return adRoleRepository.findAll();
    }

    public Optional<AdRole> findById(long id) {
        return adRoleRepository.findById(id);
    }

    public AdRole save(AdRole adRole) {
        log.info("Saving role: {}", adRole.getName());
        return adRoleRepository.save(adRole);
    }

    public void deleteById(long id) {
        adRoleRepository.deleteById(id);
    }
}
