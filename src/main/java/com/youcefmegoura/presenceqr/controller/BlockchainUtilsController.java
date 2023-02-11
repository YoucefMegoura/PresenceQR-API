package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.service.BlockchainUtilsService;
import com.youcefmegoura.presenceqr.service.SimpleStorageService;
import com.youcefmegoura.presenceqr.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blockchainUtils")
public class BlockchainUtilsController {
    @Autowired
    private BlockchainUtilsService blockchainUtilsService;

    @GetMapping("/checkEthConnection")
    public String checkEthConnection() {
        return this.blockchainUtilsService.checkEthConnection();
    }

}
