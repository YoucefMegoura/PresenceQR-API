package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.service.SimpleStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
@RequestMapping("/api/simpleStorage")
public class SimpleStorageController {

    @Autowired
    private SimpleStorageService simpleStorageService;


    @GetMapping("/setValue")
    public String setData(@RequestParam("value") Integer value) throws Exception {
        return this.simpleStorageService.setValue(value);
    }

    @GetMapping("/getValue")
    public BigInteger getData() throws Exception {
        return this.simpleStorageService.getData();
    }
}
