package com.example.netanel.race;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by DELL on 08/06/2017.
 */

public interface Player {

    /* needed in every player.
    int killometers = 0;
    ArrayList<Card> cards = new ArrayList<>(6);
    ArrayList<Card> blocks = new ArrayList<>();
    ArrayList<Card> immunity = new ArrayList<>();
    */


    public void addRival(PlayerState r);
    public void updateRival(int id, PlayerState new_state);
    public void PlayTurn();
    public void DrawCard(Card card);
    public void addKm(int addition);




}
