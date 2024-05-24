package com.example.demo.AuthenticationConfig.UserDocument;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SignUp {
    private String userName;
    private String password;

    public SignUp(){

    }

    public SignUp(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

}
