package org.example.kp1.users;

import org.example.kp1.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositori extends JpaRepository<User, Long> {
}