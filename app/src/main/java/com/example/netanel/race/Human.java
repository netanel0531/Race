package com.example.netanel.race;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 11/06/2017.
 */

public class Human implements Player {

    int id;
    List<Card> hand;
    int killometers;


    public Human(int id) {
        this.id = id;
        hand = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {

        }
        this.killometers = 0;
    }

    @Override
    public void PlayTurn() {

    }

    @Override
    public void DrawCard(Card card) {
        this.hand.add(card);
    }

    @Override
    public void addKm(int addition) {
        this.killometers += addition;
    }
}
