package ru.jabka.x6notification.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

@Log4j2
@UtilityClass
public class NotificationPrinter {

    public void printOrderNotification(final String orderId) {
        log.info("""
                  
                  _________________________________________________________________
                 /                                                                 \\
                |                    Уведомление о заказе                           |
                |                                                                   |
                |  Номер заказа: #{}                                                |
                |                                                                   |
                |  ██╗  ██╗ ██████╗      ██████╗ ██████╗  ██████╗ ██╗   ██╗██████╗  |
                |  ╚██╗██╔╝██╔════╝     ██╔════╝ ██╔══██╗██╔═══██╗██║   ██║██╔══██╗ |
                |   ╚███╔╝ ████████╗    ██║  ███╗██████╔╝██║   ██║██║   ██║██████╔╝ |
                |   ██╔██╗ ██║   ██║    ██║   ██║██╔══██╗██║   ██║██║   ██║██╔═══╝  |
                |  ██╔╝ ██╗╚██████╔╝    ╚██████╔╝██║  ██║╚██████╔╝╚██████╔╝██║      |
                |  ╚═╝  ╚═╝ ╚═════╝      ╚═════╝ ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝      |
                |                                                                   |
                |  Спасибо за ваш заказ!                                            |
                 \\_________________________________________________________________/
                    """, orderId);
    }
}