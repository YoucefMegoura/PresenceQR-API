package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.service.AdUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class AdUserController {

    private final AdUserService adUserService;

    @GetMapping
    public List<AdUser> findAll() {
        return adUserService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdUser> findById(@PathVariable String id) {
        Optional<AdUser> adUser = adUserService.findById(id);
        return adUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public AdUser save(@RequestBody AdUser adUser) {
        return adUserService.save(adUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdUser> update(@PathVariable String id, @RequestBody AdUser adUser) {
        Optional<AdUser> existingAdUser = adUserService.findById(id);
        if (existingAdUser.isPresent()) {
            adUser.setAdUserGuid(id);
            return ResponseEntity.ok(adUserService.save(adUser));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        Optional<AdUser> adUser = adUserService.findById(id);
        if (adUser.isPresent()) {
            adUserService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
