package com.desafiopicpay.repository.dto;

import java.math.BigDecimal;

public record TransactionDto(BigDecimal value, Long senderId, Long receiverId) {

}