package com.example.example.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_user_name")
    private String cardUserName;

    @Column(name = "bank_name")
    private String bankName;
}
