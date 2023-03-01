package com.example.demoPostgress.Repository;

import com.example.demoPostgress.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
