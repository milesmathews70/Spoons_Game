package com.example.spoons_game;

public class Card {
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

    public String toString() {
        return getName() + " of " + getSuit();
    }
}