package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.service.SimpleStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
public class SimpleStorageController {

    @Autowired
    private SimpleStorageService simpleStorageService;


    @GetMapping("/checkEthConnection")
    public String checkEthConnection() {
        return this.simpleStorageService.checkEthConnection();
    }

    @GetMapping("/setValue")
    public String setData(@RequestParam("value") Integer value) throws Exception {
        return this.simpleStorageService.setValue(value);
    }

    @GetMapping("/getValue")
    public BigInteger getData() throws Exception {
        return this.simpleStorageService.getData();
    }
}
