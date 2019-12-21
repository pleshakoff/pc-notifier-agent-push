package com.parcom.notifier_agent_push.notification;

import com.parcom.notifier_agent_push.user.User;
import com.parcom.notifier_agent_push.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationServiceImpl implements NotificationService {

    private final UserService userService;


    @Override
    public void send(NotificationAgentDto notificationDto) {

        User user = userService.getById(notificationDto.getIdUserReciever());
        if (user.getPhone()!=null) {
            log.info("Send push to  number \"{}\" ", user.getPhone());
            log.info("Type:  \"{}\" Title: \" {}\"", notificationDto.getNotificationType(), notificationDto.getTitle());
            log.info("Message:  \"{}\"", notificationDto.getMessage());
        }
        else
        log.info("Can't send push for user id  {}. Phone field is empty",user.getId());


    }



}
