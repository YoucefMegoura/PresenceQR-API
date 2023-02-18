package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.service.SimpleStorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/simpleStorage")
public class SimpleStorageController {

    @Autowired
    private final SimpleStorageService simpleStorageService;


    @GetMapping("/setValue")
    public String setData(@RequestParam("value") Integer value) throws Exception {
        return this.simpleStorageService.setValue(value);
    }

    @GetMapping("/getValue")
    public BigInteger getData() throws Exception {
        return this.simpleStorageService.getValue();
    }
}
