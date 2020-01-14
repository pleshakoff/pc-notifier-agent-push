package com.parcom.notifier_agent_push.notification;

import com.parcom.asyncdto.NotificationAgentDto;

public interface NotificationService {
    void send(NotificationAgentDto notificationDto);
}
