package com.german.registrationsessions.repositories;

import com.german.registrationsessions.domain.Role;
import com.german.registrationsessions.util.constants.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
