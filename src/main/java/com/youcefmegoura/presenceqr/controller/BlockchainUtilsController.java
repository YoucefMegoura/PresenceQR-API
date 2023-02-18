package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.service.BlockchainUtilsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/blockchainUtils")
public class BlockchainUtilsController {

    private final BlockchainUtilsService blockchainUtilsService;

    @GetMapping("/getWeb3ClientVersion")
    public String checkEthConnection() {
        return this.blockchainUtilsService.getWeb3ClientVersion();
    }

}
