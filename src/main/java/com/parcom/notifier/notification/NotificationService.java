package com.parcom.notifier.notification;

import com.parcom.notifier.user.User;
import com.parcom.notifier.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

    private final UserService userService;


    void send(NotificationAgentDto notificationDto) {

        User user = userService.getById(notificationDto.getIdUserReciever());
        log.info("Send push to  number \"{}\" ",user.getPhone());
        log.info("Type:  \"{}\" Title: \" {}\"",notificationDto.getNotificationType(),notificationDto.getTitle());
        log.info("Message:  \"{}\"",notificationDto.getMessage());


    }



}
