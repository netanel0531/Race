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
    PlayerState state;
    ArrayList<PlayerState> rivals;


    public Human(int id) {
        this.id = id;
        hand = new ArrayList<>(5);
        this.killometers = 0;
        state = new PlayerState();
        rivals = new ArrayList<>();
    }

    @Override
    public void addRival(PlayerState r) {
        rivals.add(r);
    }
    @Override
    public void updateRival(int id, PlayerState new_state) {
        if (id >= this.id) {
            id--;
        }
        rivals.remove(id);
        rivals.add(id, new_state);
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
