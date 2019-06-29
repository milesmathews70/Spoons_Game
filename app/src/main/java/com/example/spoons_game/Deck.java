package com.example.spoons_game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Deck implements Serializable {
    /**
     * Stacks allow us to pop off cards since we don't want to retain cards in the deck, we are just taking cards off the deck
     */
    private Stack<Card> deckOfCards;
    public Deck() {
        deckOfCards = new Stack<Card>();

        //First we load all of the cards

        loadcards();

        //Then we shuffle the deck 5 times to make sure the cards are well scrambled
        Shuffle();
        Shuffle();
        Shuffle();
        Shuffle();
        Shuffle();
    }

    /**
     * The function for shuffling, we take all of the cards out of the Stack into a ArrayList,
     * that way we can randomly take cards out of the ArrayList into the old Stack
     */
    public void Shuffle() {
        Random rand = new Random();
        List<Card> temp = new ArrayList<>();
        while (!deckOfCards.empty()) {
            temp.add(deckOfCards.pop());
        }
        while (!temp.isEmpty()) {
            int random = rand.nextInt(temp.size());
            deckOfCards.push(temp.get(random));
            temp.remove(random);
        }
    }

    /**
     * Method for loading all of the cards into the original stack
     */
    public void loadcards() {
        String suit;
        String name;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i == 0) {
                    suit = "Clubs";
                } else if (i == 1) {
                    suit = "Diamonds";
                } else if (i == 2) {
                    suit = "Hearts";
                } else {
                    suit = "Spades";
                }
                if (j == 1) {
                    name = "Ace";
                } else if (j == 11) {
                    name = "Jack";
                } else if (j == 12) {
                    name = "Queen";
                } else if (j == 13) {
                    name = "King";
                } else {
                    name = Integer.toString(j);
                }
                deckOfCards.push(new Card(suit, name));
            }
        }
    }

    /**
     * Function for dealing 4 cards out of the deck.
     * @return returns an ArrayList of 4 cards
     */
    public ArrayList<Card> deal4() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(deckOfCards.pop());
        hand.add(deckOfCards.pop());
        hand.add(deckOfCards.pop());
        hand.add(deckOfCards.pop());
        return hand;
    }

    /**
     * For keeping the deck count, for testing purposes
     * @return returns the size of the deck an Integer
     */
    public int size() {
        return deckOfCards.size();
    }

    /**
     * For sending the deck to somewhere, for testing purposes
     * @return returns a Stack of cards
     */
    public Stack<Card> sendDeck() {
        return deckOfCards;
    }

    /**
     * Takes the top card off of the deck
     * @return returns a card
     */
    public Card pop() {
        return deckOfCards.pop();
    }
}