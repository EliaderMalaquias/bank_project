package com.Inter.Online.dtos.userDTO;

import com.Inter.Online.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserResponseDTO(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email)
{
    public static UserResponseDTO transformaEmDTO(User user) {
        return new UserResponseDTO(user.getName(), user.getEmail());
    }

}
