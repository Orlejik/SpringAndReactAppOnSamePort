package com.example.demo.AuthenticationConfig.UserDocument;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {

    @Getter
    @Id
    private String id;

    @NotNull
    private String username;


    @NotNull
    private String password;

    public User(String id, String username, String password){
        super();
        this.id=id;
        this.username = username;
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


//    Methods

    public Collection<? extends GrantedAuthority> getAuthorities(){
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public String getUsername(){
        return null;
    }
}
