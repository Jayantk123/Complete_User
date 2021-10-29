package com.example.jayant.student.Repo;


import com.example.jayant.student.User.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailRepo extends JpaRepository<UserDetails, Integer> {


    static Optional<UserDetails> findStudentByEmail(String email) {
        return null;
    }


}
