package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.dto.TransactionDTO;
import com.youcefmegoura.presenceqr.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping
    public List<TransactionDTO> findAll() throws Exception {
        return this.transactionService.findAll();
    }

    @GetMapping("/{id}")
    public TransactionDTO findById(@PathVariable Long id) throws Exception {
        return this.transactionService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody TransactionDTO transactionDTO) {
        this.transactionService.save(transactionDTO);
    }
}
