package com.example.example.repository;

import com.example.example.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserById(Integer id);

    void deleteById(Integer id);
}
