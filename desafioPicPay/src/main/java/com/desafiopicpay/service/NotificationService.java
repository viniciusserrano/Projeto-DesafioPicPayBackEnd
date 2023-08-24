package com.desafiopicpay.service;

import com.desafiopicpay.repository.dto.NotificationDto;
import com.desafiopicpay.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDto notificationRequest = new NotificationDto(email, message);

        System.out.println("Notificação Enviada para o usuário ");
    }
}
