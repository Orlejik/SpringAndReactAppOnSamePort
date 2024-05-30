package com.example.demo.AuthenticationConfig.UserDocument;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document
@Data
@Entity
public class User implements UserDetails {

    @Id
    @Column(name = "_id", unique = true)
    private String id;

    @NonNull
    @Column( name = "userName", unique = true)
    private String userName;

    @NonNull
    @Column(name = "firstName")
    private String firstName;

    @NonNull
    @Column(name = "midleName")
    private String midleName;

    @NonNull
    @Column(name = "lastName")
    private String lastName;

    @NonNull
    @Column(name = "gender")
    private String gender;

    @NonNull
    @Column(name = "birthDate")
    private String birthDate;

    @NonNull
    @Column(name = "userEmail", unique = true)
    private String userEmail;

    @NonNull
    @Column(name = "password")
    private String password;

    // Other fields or methods can be added as needed
    public User() {

    }

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(100);

    public User(String id,String userName, String firstName,String midleName,String lastName, String gender, String birthDate, String email, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.userEmail = email;
        this.password = password;
    }

    public User(String userName, String firstName, String midleName, String lastName, String gender, String birthDate, String email, String password) {
        super();
        this.userName = userName;
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.userEmail = email;
        this.password = password;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(@NonNull String midleName) {
        this.midleName = midleName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }

    @NonNull
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NonNull String birthDate) {
        this.birthDate = birthDate;
    }

    @NonNull
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(@NonNull String userEmail) {
        this.userEmail = userEmail;
    }
    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
    @NonNull
    public String getId() {
        return id;
    }
    public void setId( @NonNull String id) {
        // TODO Auto-generated method stub
        String fn = getFirstName().substring(0, Math.min(getFirstName().length(), 3));
        String ln = getLastName().substring(0, Math.min(getLastName().length(), 3));
        id = ID_GENERATOR.getAndIncrement()+fn+ln;
        this.id = id;

    }
    @NonNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(@NonNull String userName) {
        this.userName = userName;
    }

    // Methods required by Spring Security for user details
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return null;
    }



}