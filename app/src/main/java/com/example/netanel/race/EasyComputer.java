package com.example.netanel.race;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 10/07/2017.
 */

public class EasyComputer implements Player {

    int id;
    List<Card> hand;
    int killometers;


    public EasyComputer(int id) {
        this.id = id;
        hand = new ArrayList<>(5);

        this.killometers = 0;
    }

    @Override
    public void addRival(PlayerState r) {

    }

    @Override
    public void updateRival(int id, PlayerState new_state) {

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

