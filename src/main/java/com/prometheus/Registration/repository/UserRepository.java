package com.prometheus.Registration.repository;

import com.prometheus.Registration.models.User;
import com.prometheus.Registration.security.services.UserDetailsImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User> findByUsername (String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
