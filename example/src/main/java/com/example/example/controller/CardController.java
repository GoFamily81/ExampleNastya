package com.example.example.controller;


import com.example.example.service.CardService;
import com.example.example.user.Card;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
@SecurityRequirement(name = "techgeeknext-api")

public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable Integer id) {
        return cardService.getCardById(id);
    }

    @PostMapping("/post")
    public Card addCard(@RequestBody Card card) {
        return cardService.addCard(card);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByCard(@PathVariable Integer id) {
        return cardService.deleteCardById(id);
    }

    @PutMapping("/putuser/{id}")
    public Card putCard(@PathVariable Integer id, @RequestBody Card card) {
        return cardService.putCard(id, card);
    }

    @GetMapping("/all")
    public List<Card> cardList() {
        return cardService.cardList();
    }
}

