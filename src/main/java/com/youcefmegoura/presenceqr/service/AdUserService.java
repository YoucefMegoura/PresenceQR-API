package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.repository.AdUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@Service
public class AdUserService {
    //TODO:: add logger
    private final AdUserRepository adUserRepository;

    @Autowired
    public AdUserService(AdUserRepository adUserRepository) {
        this.adUserRepository = adUserRepository;
    }

    public List<AdUser> findAll() {
        return adUserRepository.findAll();
    }

    public Optional<AdUser> findById(String id) {
        return adUserRepository.findById(id);
    }

    public AdUser save(AdUser adUser) {
        UUID uuid = UUID.randomUUID();
        adUser.setAdUserGuid(uuid.toString());
        return adUserRepository.save(adUser);
    }

    public void deleteById(String id) {
        adUserRepository.deleteById(id);
    }
}
