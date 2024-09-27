package com.Inter.Online.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @NotBlank(message = "O Nome não pode ser vazio!")
    private String name;

    @Email
    @NotBlank(message = "O E-mail não pode ser vazio!")
    private String email;

    @NotBlank(message = "A senha não pode ser vazia!")
    private String password;
}
