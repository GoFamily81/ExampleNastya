package com.example.example.service;

import com.example.example.user.Card;

import java.util.List;

public interface CardService {

    Card addCard(Card card);

    String deleteCardById(Integer id);

    Card putCard(Integer id, Card card);

    Card getCardById(Integer id);

    List<Card> cardList();
}
