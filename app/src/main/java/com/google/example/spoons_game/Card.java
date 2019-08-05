package com.google.example.spoons_game;

import java.io.Serializable;

public class Card implements Serializable {
    private String suit;
    private String name;
    public Card(String s, String na) {
        suit = s;
        name = na;
    }


    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() throws NullPointerException {
        try {
            return getName() + " of " + getSuit();
        } catch (NullPointerException e) {
            return "no card present.";
        }
    }
}