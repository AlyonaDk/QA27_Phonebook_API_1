package com.phonebook.tests.dto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
public class AuthRequestDto {

    private String username;
    private String password;
}
