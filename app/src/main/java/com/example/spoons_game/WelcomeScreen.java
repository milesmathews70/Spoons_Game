package com.example.spoons_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class WelcomeScreen extends AppCompatActivity {

    int NumOfPlayers;

    TextView welcome;

    EditText name;

    Button setRules;

    Button toMove;

    Player player;

    Deck deck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        welcome = findViewById(R.id.welcometag);
        String welcomeMessage = "Welcome to Spoons!";
        welcome.setText(welcomeMessage);
        setRules = findViewById(R.id.setRules);
        name = findViewById(R.id.playerName);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toMove = findViewById(R.id.moveOn);

        toMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.toString() != null) {

                    deck = new Deck();

                    player = new Player(deck.deal4(), name.toString());

                    startActivity(new Intent(WelcomeScreen.this, Game.class));
                }
            }
        });

        setRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, Rules.class));
            }
        });
    }


}
