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
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "car_colour")
    private String carColour;
}
