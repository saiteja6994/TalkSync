package com.projects.talksync.Dtos;

import lombok.Data;

@Data
public class UserSignupReqDto {
    private String mail;
    private String password;
    private String name;
}
