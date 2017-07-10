package com.example.netanel.race;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 10/07/2017.
 */

public class PlayerState {

    int killometers = 0;
    Card block = null;
    Card speed_limit = null;
    List<Card> immunity = new ArrayList<>();

    public PlayerState() {}

    public void addKM(int km) {
        this.killometers += km;
    }
    public void addBlock(Card b) {
        this.block = b;
    }

    public void addSpeedLimit(Card sl) {
        this.speed_limit = sl;
    }

    public void addImmunity(Card im) {
        if (!immunity.contains(im))
            immunity.add(im);
    }

    public int getKillometers() {
        return killometers;
    }

    public Card getBlock() {
        return block;
    }

    public Card getSpeed_limit() {
        return speed_limit;
    }

    public List<Card> getImmunityList() {
        return immunity;
    }
}
