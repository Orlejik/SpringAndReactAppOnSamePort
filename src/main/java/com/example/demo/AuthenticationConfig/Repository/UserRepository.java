package com.example.demo.AuthenticationConfig.Repository;

import java.util.Optional;
import com.example.demo.AuthenticationConfig.UserDocument.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    boolean existsByUserName(String username);
    Optional<User> findByUserName(String username);
}