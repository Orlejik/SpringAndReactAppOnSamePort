package com.example.demo.AuthenticationConfig.UserDocument;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private String id;
    private String email;

    public static UserDTO from(User user){
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getUserEmail())
                .build();
    }
}
