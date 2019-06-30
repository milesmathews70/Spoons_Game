package com.example.spoons_game;

import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {
    /**
     * The players "stack", for the dealer it will be deck
     */
    private Stack<Card> myStack;
    /**
     * The name of the player
     */
    private String name;
    /**
     * The player's hand
     */
    private ArrayList<Card> hand;
    public Player(ArrayList<Card> h, String n) {
        hand = h;
        name = n;
    }

    /**
     * The function for swapping cards
     * @param pos The position to swap cards
     * @param card The new card
     */
    public void swap(int pos, Card card) {
        hand.remove(pos);
        hand.add(card);
    }

    /**
     * The function for skipping the new card and passing it to the next player
     * @param player The player we are passing the new card to
     * @param card The new card
     * @return returns a message that displays we successfully passed the card over, will edit later
     */
    public String skip(Player player, Card card) {
        return this.name + " passed " + sendOldCard(player, card) + " to " + player.name;
    }

    /**
     * The function for presenting the new card to the player
     * @param card The new card
     * @return returns a message that displays we successfully have seen the new card, will edit later
     */
    public String presentNewCard(Card card) {
        String rtrn = card.getName();
        rtrn = rtrn.concat(" of ");
        rtrn = rtrn.concat(card.getSuit());
        return rtrn;
    }

    /**
     * The function for sending the now old card to the next player
     * @param player The next player
     * @param card The old player
     * @return returns a message that displays we successfully have sent the card to next player. will edit later
     */
    public String sendOldCard(Player player, Card card) {
        return player.presentNewCard(card);
    }

    /**
     * The function to see whats in my hand
     * @return returns a String of whats inside my hand
     */
    public String whatsInMyHand() {
        String rtrn = hand.get(0).toString();
        rtrn = rtrn.concat(", ");
        rtrn = rtrn.concat(hand.get(1).toString());
        rtrn = rtrn.concat(", ");
        rtrn = rtrn.concat(hand.get(2).toString());
        rtrn = rtrn.concat(", ");
        rtrn = rtrn.concat(hand.get(3).toString());
        return rtrn;
    }

    /**
     * The function for testing whether we have 4 of the same cards
     * @return returns a boolean
     */
    public boolean haveSame() {
        return (hand.get(0).getName().equals(hand.get(1).getName()) &&
                hand.get(2).getName().equals(hand.get(1).getName()) &&
                hand.get(2).getName().equals(hand.get(3).getName()));
    }

    public Card getCard(int pos) {
        return hand.get(pos);
    }
}

