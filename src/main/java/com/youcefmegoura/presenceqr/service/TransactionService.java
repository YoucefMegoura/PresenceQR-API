package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.dto.TransactionDTO;

import java.util.List;

/**
 * @author youcefmegoura
 * @created 14/02/2023
 */
public interface TransactionService {

    List<TransactionDTO> findAll() throws Exception;

    String save(TransactionDTO transactionDTO);

    TransactionDTO findById(long id) throws Exception;
}
