package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdRole;
import com.youcefmegoura.presenceqr.repository.AdRoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AdRoleService {
    //TODO:: add logger
    private final AdRoleRepository adRoleRepository;

    @Autowired
    public AdRoleService(AdRoleRepository adRoleRepository) {
        this.adRoleRepository = adRoleRepository;
    }

    public List<AdRole> findAll() {
        return adRoleRepository.findAll();
    }

    public Optional<AdRole> findById(long id) {
        return adRoleRepository.findById(id);
    }

    public AdRole save(AdRole adRole) {
        return adRoleRepository.save(adRole);
    }

    public void deleteById(long id) {
        adRoleRepository.deleteById(id);
    }
}
