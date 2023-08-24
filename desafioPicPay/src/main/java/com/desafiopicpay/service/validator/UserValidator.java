package com.desafiopicpay.service.validator;

import com.desafiopicpay.repository.entity.User;
import com.desafiopicpay.repository.enums.UserTypeEnum;

import java.math.BigDecimal;

public class UserValidator {


    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserTypeEnum() == UserTypeEnum.MERCHANT) {
            throw new Exception("Usuário do Tipo Lojista não está autorizado a realizar transação ");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo Insuficiente ");
        }
    }

}
