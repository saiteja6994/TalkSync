package com.projects.talksync.Dtos;

import lombok.Data;

@Data
public class UserLoginReq {
    private String email;
    private String password;
}
