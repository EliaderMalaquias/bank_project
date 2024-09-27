package com.Inter.Online.repositories;

import com.Inter.Online.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface UserRepository extends JpaRepository<User, UUID> {
}
