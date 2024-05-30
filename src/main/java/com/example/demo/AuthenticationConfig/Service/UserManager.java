package com.example.demo.AuthenticationConfig.Service;

import com.example.demo.AuthenticationConfig.Repository.UserRepository;
import com.example.demo.AuthenticationConfig.UserDocument.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
public class UserManager implements UserDetailsManager {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void createUser(UserDetails user) {
        ((User) user).setPassword(passwordEncoder.encode(user.getPassword()));
        // Save the user in the repository
        userRepository.save((User) user);
    }

    @Override
    public void updateUser(UserDetails user) {
// You can implement this method to update user details if needed
        // For example, updating roles or other user information
    }

    @Override
    public void deleteUser(String email) {
// You can implement this method to delete a user by username
        // Typically used when a user wants to delete their account
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        // You can implement this method to change the user's password
        // For example, when a user wants to change their password
    }

    @Override
    public boolean userExists(String email) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Fetch the user from the repository by username
        Optional<User> userOptional = userRepository.findByUserEmail(email);

        //Check if User exists
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException(MessageFormat.format("User with username {0} not found", email));
        }

        // Return the UserDetails extracted from the User entity
        return userOptional.get();
    }
}
