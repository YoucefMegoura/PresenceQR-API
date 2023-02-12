package com.youcefmegoura.presenceqr.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
    private String studentId;
    private Long courseId;
    private Long created;

}
