package com.muriloDev.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserNameDTO {

    private String name;
    private String email;
    private Long id;
}
