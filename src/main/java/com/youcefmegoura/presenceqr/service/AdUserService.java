package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.repository.AdUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdUserService {

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
        return adUserRepository.save(adUser);
    }

    public void deleteById(String id) {
        adUserRepository.deleteById(id);
    }
}
