package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.service.AdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class AdUserController {

    private final AdUserService adUserService;

    @Autowired
    public AdUserController(AdUserService adUserService) {
        this.adUserService = adUserService;
    }

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
