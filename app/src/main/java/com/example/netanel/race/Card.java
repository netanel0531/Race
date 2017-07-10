package com.example.netanel.race;

/**
 * Created by DELL on 08/06/2017.
 */

public class Card {

    //Cards list
    public static final int GREEN = 1;    public static final int RED = 8;
    public static final int OPEN = 2;    public static final int RESTRICT = 7;
    public static final int GAS = 3;    public static final int NEED_GAS = 9;
    public static final int SPARE = 4;    public static final int FLAT = 10;
    public static final int FINE_PAYED = 5;    public static final int COP = 11;
    public static final int FIX = 6;    public static final int ACCIDENT = 12;
    public static final int EMERGENCY = 13;    public static final int FUEL = 14;
    public static final int CAREFULL = 15;    public static final int TWENTY_FIVE = 16;
    public static final int FIFTY = 17;    public static final int SEVENTY_FIVE = 18;
    public static final int ONE_HUNDRED = 19;    public static final int TWO_HUNDRED = 20;

    //Card types
    public static final int SPEED = 1;  public static final int IMMUNITY = 2;
    public static final int BLOCK = 3;  public static final int FORWARD = 5;
    public static final int SPEED_LIMIT = 4;

    int ownerId = 0;
    int card;
    int type;

    public Card(int type, int id) {
        this.ownerId = id;
        this.card = type;
        switch (type) {
            case GREEN:case OPEN:case GAS:case SPARE:case FINE_PAYED:case FIX:
                this.type = Card.FORWARD;
                break;
            case RESTRICT:
                this.type = Card.SPEED_LIMIT;
                break;
            case RED:case NEED_GAS:case FLAT:case COP:case ACCIDENT:
                this.type = Card.BLOCK;
                break;
            case EMERGENCY:case FUEL:case CAREFULL:
                this.type = Card.IMMUNITY;
                break;
            case TWENTY_FIVE:case FIFTY:case SEVENTY_FIVE:case ONE_HUNDRED:case TWO_HUNDRED:
                this.type = SPEED;
        }
    }

}
