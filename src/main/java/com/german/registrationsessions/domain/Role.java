package com.german.registrationsessions.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    private Long id;

    private String name;
    
    @Override
    public String getAuthority() {
        return this.name;
    }
}
