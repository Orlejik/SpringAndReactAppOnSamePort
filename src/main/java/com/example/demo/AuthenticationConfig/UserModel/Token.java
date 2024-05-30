package com.example.demo.AuthenticationConfig.UserModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Token {

    private String userId;
    private String accessToken;
    private String refreshToken;


}