package com.example.example.service.impl;


import com.example.example.repository.CardRepository;
import com.example.example.service.CardService;
import com.example.example.user.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public String deleteCardById(Integer id) {
        cardRepository.deleteById(id);
        return "user с id был удален: " + id;
    }

    @Override
    public Card putCard(Integer id, Card card) {
        card.setId(id);
        cardRepository.save(card);
        return getCardById(id);
    }

    @Override
    public Card getCardById(Integer id) {
        return cardRepository.getCardById(id);
    }

    @Override
    public List<Card> cardList() {
        return cardRepository.findAll();
    }
}
