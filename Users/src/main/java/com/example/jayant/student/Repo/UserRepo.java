package com.example.jayant.student.Repo;

import com.example.jayant.student.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {


  static Optional<User> findStudentByEmail(String email) {
    return null;
  }


}
