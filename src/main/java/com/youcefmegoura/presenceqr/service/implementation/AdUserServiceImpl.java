package com.youcefmegoura.presenceqr.service.implementation;

import com.youcefmegoura.presenceqr.service.AdUserService;
import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.repository.AdUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdUserServiceImpl implements AdUserService {
    //TODO:: add logger
    private final AdUserRepository adUserRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<AdUser> findAll() {
        return adUserRepository.findAll();
    }

    @Override
    public Optional<AdUser> findById(String id) {
        return adUserRepository.findById(id);
    }

    @Override
    public Optional<AdUser> findByEmail(String email) {
        return adUserRepository.findByEmailAndIsActif(email);
    }

    @Override
    public AdUser save(AdUser adUser) {
        UUID uuid = UUID.randomUUID();
        adUser.setAdUserGuid(uuid.toString());
        adUser.setPassword(passwordEncoder.encode(adUser.getPassword()));
        return adUserRepository.save(adUser);
    }

    @Override
    public void deleteById(String id) {
        adUserRepository.deleteById(id);
    }
}
