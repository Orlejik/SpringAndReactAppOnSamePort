package com.example.demo.AuthenticationConfig.UserDocument;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SignUp {
    private String userName;
    private String firstName;
    private String midleName;
    private String lastName;
    private String gender;
    private String birthDate;
    private String userEmail;
    private String password;

    public SignUp(){

    }

    public SignUp(String userName, String firstName,String midleName, String lastName, String gender, String birthDate, String email, String password) {
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

}
