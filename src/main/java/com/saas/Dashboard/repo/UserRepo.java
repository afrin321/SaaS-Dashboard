package com.saas.Dashboard.repo;

import com.saas.Dashboard.model.User;
import com.saas.Dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    public Optional<User> findByEmail(String email);
}
