package com.google.example.spoons_game;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class ThreeSpoons extends Activity {

    ImageView card1, card2, card3, card4,newcard;

    TextView displayNewCard, roundlabel;

    Card cardone, cardtwo, cardthree, cardfour, cardfive;
    String c1, c2, c3, c4, c5;
    ImageView spoonone, spoontwo, spoonthree;

    private static final String TAG = "Game";

    public String newCard = "New Card:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Player player = (Player) getIntent().getSerializableExtra("host");
        player.newDeck();
        final int num = getIntent().getIntExtra("num", 0);
        if (num == 0) {
            Log.d("Game", "Round is wrong bruh");
        }
        final String r = getIntent().getStringExtra("round").concat(" ");
        String round = r.concat(Integer.toString(num));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_spoons);

        displayNewCard = findViewById(R.id.newcardLabel);
        displayNewCard.setText(newCard);

        roundlabel = findViewById(R.id.Rounds);
        roundlabel.setText(round);

        card1 = findViewById(R.id.carduno);
        card2 = findViewById(R.id.carddos);
        card3 = findViewById(R.id.cardtres);
        card4 = findViewById(R.id.cardquatro);
        newcard = findViewById(R.id.cardcinco);

        spoonone = findViewById(R.id.spoonsuno);
        spoonone.setImageResource(R.drawable.spoon);
        spoontwo = findViewById(R.id.spoondos);
        spoontwo.setImageResource(R.drawable.spoon);
        spoonthree = findViewById(R.id.spoontres);
        spoonthree.setImageResource(R.drawable.spoon);

        cardfive = player.getDeck().pop();
        resetHand(player, player.getDeck());

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardfive = player.swap(0, cardfive);
                resetHand(player, player.getDeck());
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardfive = player.swap(1, cardfive);
                resetHand(player, player.getDeck());
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardfive = player.swap(2, cardfive);
                resetHand(player, player.getDeck());
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardfive = player.swap(3, cardfive);
                resetHand(player, player.getDeck());
            }
        });

        newcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardfive = player.getDeck().popNewCard(cardfive, player);
                resetHand(player, player.getDeck());
            }
        });

        spoonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(ThreeSpoons.this, TwoSpoons.class);
                newIntent.putExtra("num", num + 1);
                newIntent.putExtra("host", player);
                newIntent.putExtra("round", "Round");
                startActivity(newIntent);
            }
        });

        spoontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(ThreeSpoons.this, TwoSpoons.class);
                newIntent.putExtra("num", num + 1);
                newIntent.putExtra("host", player);
                newIntent.putExtra("round", "Round");
                startActivity(newIntent);
            }
        });

        spoonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(ThreeSpoons.this, TwoSpoons.class);
                newIntent.putExtra("num", num + 1);
                newIntent.putExtra("host", player);
                newIntent.putExtra("round", "Round");
                startActivity(newIntent);
            }
        });
    }

    //Use displayCard to display the cards for the game,
    // this method is to be called whenever we reset the hand
    public void displayCard(ImageView image, String cardName) {
        Log.d(TAG, "checking if the images work");
        if (cardName.equals("Ace of Clubs")) {
            image.setImageResource(R.drawable.ac);
        } else if (cardName.equals("Ace of Diamonds")) {
            image.setImageResource(R.drawable.ad);
        } else if (cardName.equals("Ace of Hearts")) {
            image.setImageResource(R.drawable.ah);
        } else if (cardName.equals("Ace of Spades")) {
            image.setImageResource(R.drawable.as);
        } else if (cardName.equals("2 of Diamonds")) {
            image.setImageResource(R.drawable.twod);
        } else if (cardName.equals("2 of Hearts")) {
            image.setImageResource(R.drawable.twoh);
        } else if (cardName.equals("2 of Spades")) {
            image.setImageResource(R.drawable.twos);
        } else if (cardName.equals("2 of Clubs")) {
            image.setImageResource(R.drawable.twoc);
        } else if (cardName.equals("3 of Hearts")) {
            image.setImageResource(R.drawable.threeh);
        } else if (cardName.equals("3 of Spades")) {
            image.setImageResource(R.drawable.threes);
        } else if (cardName.equals("3 of Diamonds")) {
            image.setImageResource(R.drawable.threed);
        } else if (cardName.equals("3 of Clubs")) {
            image.setImageResource(R.drawable.threec);
        } else if (cardName.equals("4 of Spades")) {
            image.setImageResource(R.drawable.fours);
        } else if (cardName.equals("4 of Diamonds")) {
            image.setImageResource(R.drawable.fourd);
        } else if (cardName.equals("4 of Hearts")) {
            image.setImageResource(R.drawable.fourh);
        } else if (cardName.equals("4 of Clubs")) {
            image.setImageResource(R.drawable.fourc);
        } else if (cardName.equals("5 of Diamonds")) {
            image.setImageResource(R.drawable.fived);
        } else if (cardName.equals("5 of Hearts")) {
            image.setImageResource(R.drawable.fiveh);
        } else if (cardName.equals("5 of Spades")) {
            image.setImageResource(R.drawable.fives);
        } else if (cardName.equals("5 of Clubs")) {
            image.setImageResource(R.drawable.fivec);
        } else if (cardName.equals("6 of Hearts")) {
            image.setImageResource(R.drawable.sixh);
        } else if (cardName.equals("6 of Spades")) {
            image.setImageResource(R.drawable.sixs);
        } else if (cardName.equals("6 of Diamonds")) {
            image.setImageResource(R.drawable.sixd);
        } else if (cardName.equals("6 of Clubs")) {
            image.setImageResource(R.drawable.sixc);
        } else if (cardName.equals("7 of Spades")) {
            image.setImageResource(R.drawable.sevens);
        } else if (cardName.equals("7 of Diamonds")) {
            image.setImageResource(R.drawable.sevend);
        } else if (cardName.equals("7 of Hearts")) {
            image.setImageResource(R.drawable.sevenh);
        } else if (cardName.equals("7 of Clubs")) {
            image.setImageResource(R.drawable.sevenc);
        } else if (cardName.equals("8 of Diamonds")) {
            image.setImageResource(R.drawable.eightd);
        } else if (cardName.equals("8 of Hearts")) {
            image.setImageResource(R.drawable.eighth);
        } else if (cardName.equals("8 of Spades")) {
            image.setImageResource(R.drawable.eights);
        } else if (cardName.equals("8 of Clubs")) {
            image.setImageResource(R.drawable.eightc);
        } else if (cardName.equals("9 of Hearts")) {
            image.setImageResource(R.drawable.nineh);
        } else if (cardName.equals("9 of Spades")) {
            image.setImageResource(R.drawable.nines);
        } else if (cardName.equals("9 of Diamonds")) {
            image.setImageResource(R.drawable.nined);
        } else if (cardName.equals("9 of Clubs")) {
            image.setImageResource(R.drawable.ninec);
        } else if (cardName.equals("10 of Hearts")) {
            image.setImageResource(R.drawable.tenh);
        } else if (cardName.equals("10 of Spades")) {
            image.setImageResource(R.drawable.tens);
        } else if (cardName.equals("10 of Diamonds")) {
            image.setImageResource(R.drawable.tend);
        } else if (cardName.equals("10 of Clubs")) {
            image.setImageResource(R.drawable.tenc);
        } else if (cardName.equals("Jack of Hearts")) {
            image.setImageResource(R.drawable.jh);
        } else if (cardName.equals("Jack of Spades")) {
            image.setImageResource(R.drawable.js);
        } else if (cardName.equals("Jack of Diamonds")) {
            image.setImageResource(R.drawable.jd);
        } else if (cardName.equals("Jack of Clubs")) {
            image.setImageResource(R.drawable.jc);
        } else if (cardName.equals("Queen of Spades")) {
            image.setImageResource(R.drawable.qs);
        } else if (cardName.equals("Queen of Diamonds")) {
            image.setImageResource(R.drawable.qd);
        } else if (cardName.equals("Queen of Hearts")) {
            image.setImageResource(R.drawable.qh);
        } else if (cardName.equals("Queen of Clubs")) {
            image.setImageResource(R.drawable.qc);
        } else if (cardName.equals("King of Diamonds")) {
            image.setImageResource(R.drawable.kd);
        } else if (cardName.equals("King of Hearts")) {
            image.setImageResource(R.drawable.kh);
        } else if (cardName.equals("King of Spades")) {
            image.setImageResource(R.drawable.ks);
        } else {
            image.setImageResource(R.drawable.kc);
        }
    }

    public void resetHand(Player player, Deck deck) {
        cardone = player.getCard(0);
        cardtwo = player.getCard(1);
        cardthree = player.getCard(2);
        cardfour = player.getCard(3);

        c1 = cardone.toString();
        c2 = cardtwo.toString();
        c3 = cardthree.toString();
        c4 = cardfour.toString();
        c5 = cardfive.toString();

        displayCard(card1, c1);
        displayCard(card2, c2);
        displayCard(card3, c3);
        displayCard(card4, c4);
        displayCard(newcard, c5);

        Log.d("Game", Integer.toString(player.getDeck().size()));
        Log.d("Game", Integer.toString(player.getOtherDeck().size()));
    }
}
