package ru.jabka.x6notification.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.jabka.x6notification.util.NotificationPrinter;

@Log4j2
@Service
@RequiredArgsConstructor
public class NotificationService {

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void receive(String message) {
        NotificationPrinter.printOrderNotification(message);
    }
}