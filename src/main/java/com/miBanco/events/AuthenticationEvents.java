package com.miBanco.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuthenticationEvents {

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent event) {
        log.info("Login successful for the user: {}", event.getAuthentication().getName());
    }

    public void onFailure(AuthenticationSuccessEvent event) {
        log.info("Login failed for the user: {} due to {}", event.getAuthentication().getName());
    }
}
