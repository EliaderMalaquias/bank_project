package com.Inter.Online.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    private static Long numAccount = 1L;

    private BigDecimal balance = BigDecimal.ZERO;


    @JsonBackReference
    @OneToOne(mappedBy = "account")
    private User user;

    public Account() {
        numAccount++;
    }
}