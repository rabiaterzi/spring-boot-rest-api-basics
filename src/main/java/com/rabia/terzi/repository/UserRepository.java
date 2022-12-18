package com.rabia.terzi.repository;

import com.rabia.terzi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //@Query

}
