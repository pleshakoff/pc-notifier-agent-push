package com.parcom.notifier_agent_push.notification;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class NotificationAgentDto  {

    @NotNull
    private  final NotificationType notificationType;

    @NotNull
    private final String  title;

    private final String  message;

    private final @NotNull String idObjectSender;

    @NotNull
    private final Long idUserSender;

    @NotNull
    private final Long idUserReciever;


}
