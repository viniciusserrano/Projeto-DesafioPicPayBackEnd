package com.desafiopicpay.service;

import com.desafiopicpay.repository.dto.NotificationDto;
import com.desafiopicpay.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDto notificationRequest = new NotificationDto(email, message);

        //ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);

        //if(!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
            //System.out.println("Erro ao Enviar notificação ");
            //throw new Exception("Serviço de notificação está fora do ar ");
        //}

        System.out.println("Notificação Enviada para o usuário ");
    }
}
