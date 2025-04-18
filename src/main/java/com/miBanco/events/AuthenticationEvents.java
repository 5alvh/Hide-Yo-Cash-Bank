package com.miBanco.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuthenticationEvents {
    //The success event is fired when the authentication is successful
    //Events in spring security are messages that fire when something happens
    @EventListener
    public void onSuccess(AuthenticationSuccessEvent event) {
        log.info("Login successful for the user: {}", event.getAuthentication().getName());
    }

    public void onFailure(AbstractAuthenticationFailureEvent event) {
        log.info("Login failed for the user: {} due to {}", event.getAuthentication().getName(),
                event.getException().getMessage());
    }
}
