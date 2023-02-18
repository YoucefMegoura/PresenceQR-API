package com.youcefmegoura.presenceqr.service.implementation;

import com.youcefmegoura.presenceqr.model.AdRole;
import com.youcefmegoura.presenceqr.repository.AdRoleRepository;
import com.youcefmegoura.presenceqr.service.AdRoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class AdRoleServiceImpl implements AdRoleService {
    //TODO:: add logger
    private final AdRoleRepository adRoleRepository;

    @Override
    public List<AdRole> findAll() {
        return adRoleRepository.findAll();
    }

    @Override
    public Optional<AdRole> findById(long id) {
        return adRoleRepository.findById(id);
    }

    @Override
    public AdRole save(AdRole adRole) {
        log.info("Saving role: {}", adRole.getName());
        return adRoleRepository.save(adRole);
    }
    @Override
    public void deleteById(long id) {
        adRoleRepository.deleteById(id);
    }
}
