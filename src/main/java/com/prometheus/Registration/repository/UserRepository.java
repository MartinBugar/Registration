package com.prometheus.Registration.repository;

import com.prometheus.Registration.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findUserByName (String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
