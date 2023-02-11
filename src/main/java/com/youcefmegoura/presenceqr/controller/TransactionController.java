package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.dto.TransactionDTO;
import com.youcefmegoura.presenceqr.model.MCourse;
import com.youcefmegoura.presenceqr.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{id}")
    public Object[] findById(@PathVariable Long id) throws Exception {
        return this.transactionService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody TransactionDTO transactionDTO) {
        this.transactionService.save(transactionDTO);
    }
}
