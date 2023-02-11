package com.youcefmegoura.presenceqr.controller;
import com.youcefmegoura.presenceqr.model.AdRole;
import com.youcefmegoura.presenceqr.service.AdRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class AdRoleController {

    private final AdRoleService adRoleService;

    @Autowired
    public AdRoleController(AdRoleService adRoleService) {
        this.adRoleService = adRoleService;
    }

    @GetMapping
    public List<AdRole> findAll() {
        return adRoleService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdRole> findById(@PathVariable long id) {
        Optional<AdRole> adRole = adRoleService.findById(id);
        return adRole.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public AdRole save(@RequestBody AdRole adRole) {
        return adRoleService.save(adRole);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdRole> update(@PathVariable long id, @RequestBody AdRole adRole) {
        Optional<AdRole> existingAdRole = adRoleService.findById(id);
        if (existingAdRole.isPresent()) {
            adRole.setAdRoleId((id));
            return ResponseEntity.ok(adRoleService.save(adRole));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        Optional<AdRole> adRole = adRoleService.findById(id);
        if (adRole.isPresent()) {
            adRoleService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
