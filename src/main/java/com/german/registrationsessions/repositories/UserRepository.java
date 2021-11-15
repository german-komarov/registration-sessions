package com.german.registrationsessions.repositories;

import com.german.registrationsessions.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u join FETCH u.roles where u.email=:p_email")
    Optional<User> findByEmailWithRoles(@Param("p_email") String email);
}
