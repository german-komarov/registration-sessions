package com.german.registrationsessions.config;

import com.german.registrationsessions.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class EventListeningConfig {

    private final RoleService roleService;

    @Autowired
    public EventListeningConfig(RoleService roleService) {
        this.roleService = roleService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        this.roleService.fillDatabaseWithRoles();
    }

}
