package com.rabia.terzi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
}
