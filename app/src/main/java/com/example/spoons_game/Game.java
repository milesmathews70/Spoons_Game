package com.example.spoons_game;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class Game extends AppCompatActivity {

    Card cardone, cardtwo, cardthree, cardfour, cardfive;
    String c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Player player = (Player) getIntent().getSerializableExtra("player");
        final Deck deck = (Deck) getIntent().getSerializableExtra("deck");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        cardone = player.getCard(0);
        cardtwo = player.getCard(1);
        cardthree = player.getCard(2);
        cardfour = player.getCard(3);
        cardfive = deck.pop();

        c1 = cardone.toString();
        c2 = cardtwo.toString();
        c3 = cardthree.toString();
        c4 = cardfour.toString();
        c5 = cardfive.toString();


    }

    //Use displayCard to display the cards for the game,
    // this method is to be called when we deal the hand and
    // every time a card is sent to the player and a card is swapped.
    public Image displayCard(String cardName) {
        Image image = null;
        if (cardName.equals("1 of Clubs")) {

        } else if (cardName.equals("1 of Diamonds")) {

        } else if (cardName.equals("1 of Hearts")) {

        } else if (cardName.equals("1 of Spades")) {

        } else if (cardName.equals("2 of Diamonds")) {

        } else if (cardName.equals("2 of Hearts")) {

        } else if (cardName.equals("2 of Spades")) {

        } else if (cardName.equals("2 of Clubs")) {

        } else if (cardName.equals("3 of Hearts")) {

        } else if (cardName.equals("3 of Spades")) {

        } else if (cardName.equals("3 of Diamonds")) {

        } else if (cardName.equals("3 of Clubs")) {

        } else if (cardName.equals("4 of Spades")) {

        } else if (cardName.equals("4 of Diamonds")) {

        } else if (cardName.equals("4 of Hearts")) {

        } else if (cardName.equals("4 of Clubs")) {

        } else if (cardName.equals("5 of Diamonds")) {

        } else if (cardName.equals("5 of Hearts")) {

        } else if (cardName.equals("5 of Spades")) {

        } else if (cardName.equals("5 of Clubs")) {

        } else if (cardName.equals("6 of Hearts")) {

        } else if (cardName.equals("6 of Spades")) {

        } else if (cardName.equals("6 of Diamonds")) {

        } else if (cardName.equals("6 of Clubs")) {

        } else if (cardName.equals("7 of Spades")) {

        } else if (cardName.equals("7 of Diamonds")) {

        } else if (cardName.equals("7 of Hearts")) {

        } else if (cardName.equals("7 of Clubs")) {

        } else if (cardName.equals("8 of Diamonds")) {

        } else if (cardName.equals("8 of Hearts")) {

        } else if (cardName.equals("8 of Spades")) {

        } else if (cardName.equals("8 of Clubs")) {

        } else if (cardName.equals("9 of Hearts")) {

        } else if (cardName.equals("9 of Spades")) {

        } else if (cardName.equals("9 of Diamonds")) {

        } else if (cardName.equals("9 of Clubs")) {

        } else if (cardName.equals("10 of Hearts")) {

        } else if (cardName.equals("10 of Spades")) {

        } else if (cardName.equals("10 of Diamonds")) {

        } else if (cardName.equals("10 of Clubs")) {

        } else if (cardName.equals("Jack of Hearts")) {

        } else if (cardName.equals("Jack of Spades")) {

        } else if (cardName.equals("Jack of Diamonds")) {

        } else if (cardName.equals("Jack of Clubs")) {

        } else if (cardName.equals("Queen of Spades")) {

        } else if (cardName.equals("Queen of Diamonds")) {

        } else if (cardName.equals("Queen of Hearts")) {

        } else if (cardName.equals("Queen of Clubs")) {

        } else if (cardName.equals("King of Diamonds")) {

        } else if (cardName.equals("King of Hearts")) {

        } else if (cardName.equals("King of Spades")) {

        } else {

        }
        return image;
    }
}

