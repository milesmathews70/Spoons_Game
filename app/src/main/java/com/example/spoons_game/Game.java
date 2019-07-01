package com.example.spoons_game;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

public class Game extends AppCompatActivity {

    ImageView card1, card2, card3, card4,newcard;

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

        card1 = findViewById(R.id.carduno);
        card2 = findViewById(R.id.carddos);
        card3 = findViewById(R.id.cardtres);
        card4 = findViewById(R.id.cardquatro);
        newcard = findViewById(R.id.cardcinco);

        displayCard(card1, c1);
        displayCard(card2, c2);
        displayCard(card3, c3);
        displayCard(card4, c4);
        displayCard(newcard, c5);

    }

    //Use displayCard to display the cards for the game,
    // this method is to be called when we deal the hand,
    // every time a card is sent to the player, and a card is swapped.
    public void displayCard(ImageView image, String cardName) {
        if (cardName.equals("Ace of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "AC.png"));
        } else if (cardName.equals("Ace of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "AD.png"));
        } else if (cardName.equals("Ace of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "AH.png"));
        } else if (cardName.equals("Ace of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "AS.png"));
        } else if (cardName.equals("2 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "2D.png"));
        } else if (cardName.equals("2 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "2H.png"));
        } else if (cardName.equals("2 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "2S.png"));
        } else if (cardName.equals("2 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "2C.png"));
        } else if (cardName.equals("3 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "3H.png"));
        } else if (cardName.equals("3 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "3S.png"));
        } else if (cardName.equals("3 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "3D.png"));
        } else if (cardName.equals("3 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "3C.png"));
        } else if (cardName.equals("4 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "4C.png"));
        } else if (cardName.equals("4 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "4D.png"));
        } else if (cardName.equals("4 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "4H.png"));
        } else if (cardName.equals("4 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "4C.png"));
        } else if (cardName.equals("5 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "5D.png"));
        } else if (cardName.equals("5 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "5H.png"));
        } else if (cardName.equals("5 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "5S.png"));
        } else if (cardName.equals("5 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "5C.png"));
        } else if (cardName.equals("6 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "6H.png"));
        } else if (cardName.equals("6 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "6S.png"));
        } else if (cardName.equals("6 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "6D.png"));
        } else if (cardName.equals("6 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "6C.png"));
        } else if (cardName.equals("7 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "7S.png"));
        } else if (cardName.equals("7 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "7D.png"));
        } else if (cardName.equals("7 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "7H.png"));
        } else if (cardName.equals("7 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "7C.png"));
        } else if (cardName.equals("8 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "8D.png"));
        } else if (cardName.equals("8 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "8H.png"));
        } else if (cardName.equals("8 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "8S.png"));
        } else if (cardName.equals("8 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "8C.png"));
        } else if (cardName.equals("9 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "9H.png"));
        } else if (cardName.equals("9 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "9S.png"));
        } else if (cardName.equals("9 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "9D.png"));
        } else if (cardName.equals("9 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "9C.png"));
        } else if (cardName.equals("10 of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "10H.png"));
        } else if (cardName.equals("10 of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "10S.png"));
        } else if (cardName.equals("10 of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "10D.png"));
        } else if (cardName.equals("10 of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "10C.png"));
        } else if (cardName.equals("Jack of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "JH.png"));
        } else if (cardName.equals("Jack of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "JS.png"));
        } else if (cardName.equals("Jack of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "JD.png"));
        } else if (cardName.equals("Jack of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "JC.png"));
        } else if (cardName.equals("Queen of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "QS.png"));
        } else if (cardName.equals("Queen of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "QD.png"));
        } else if (cardName.equals("Queen of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "QH.png"));
        } else if (cardName.equals("Queen of Clubs")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "QC.png"));
        } else if (cardName.equals("King of Diamonds")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "KD.png"));
        } else if (cardName.equals("King of Hearts")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "KH.png"));
        } else if (cardName.equals("King of Spades")) {
            image.setImageDrawable(new BitmapDrawable(getResources(), "KS.png"));
        } else {
            image.setImageDrawable(new BitmapDrawable(getResources(), "KC.png"));
        }
    }
}

