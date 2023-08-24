package com.desafiopicpay.repository.dto;

import com.desafiopicpay.repository.enums.UserTypeEnum;

import java.math.BigDecimal;

public record UserDto(String firstName, String lastName, String document, BigDecimal balance, String email,
                      String password, UserTypeEnum userTypeEnum) {
}
