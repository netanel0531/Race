package com.example.netanel.race;

import java.util.ArrayList;

/**
 * Created by DELL on 11/06/2017.
 */

public class GameEngine {

    ArrayList<Player> players;
    ArrayList<Card> deck;
    boolean finish = false;

    public GameEngine(int numOfPlayers) {
        players = new ArrayList<>(numOfPlayers);
        deck = new ArrayList<>(112);
    }

    public void startGame() {
        while(!finish) {
            for(int i = 0; i < players.size(); i++) {
                players.get(i).PlayTurn();
            }
        }
    }

    public void getTouchEvent(int widgetId) {

    }

    public void applyUpdate(int eventType, int objectId) {

    }
}
