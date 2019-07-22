package com.example.spoons_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import java.util.*;

public class WelcomeScreen extends AppCompatActivity {

    TextView errorName, welcomeTag, Name;

    EditText playerName;

    Button setRules, toMove;

    Player player;

    Deck deck;

    String welcomeMessage = "Welcome to Spoons!";

    String toPlay = "Click to Play!";

    String needName = "Need a name to play!";

    String rules = "Click to see the rules!";

    String name = "Name:";

    ArrayList<Player> listOfPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRules = findViewById(R.id.setRules);
        toMove = findViewById(R.id.moveOn);
        welcomeTag = findViewById(R.id.welcomeTag);
        Name = findViewById(R.id.Name);
        errorName = findViewById(R.id.needName);
        playerName = findViewById(R.id.playerName);

        errorName.setText(needName);
        setRules.setText(rules);
        toMove.setText(toPlay);
        welcomeTag.setText(welcomeMessage);
        Name.setText(name);
        playerName.setText(null);




        toMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If the player has a game name, move on

                if (!playerName.toString().equals("")) {

                    deck = new Deck();

                    player = new Player(Name.toString(), deck);

                    Intent newIntent = new Intent(WelcomeScreen.this, SevenSpoons.class);
                    newIntent.putExtra("host", player);
                    newIntent.putExtra("round", "Round ");
                    newIntent.putExtra("num", 1);
                    startActivity(newIntent);
                } else {
                    //Else, let the player know they need a game name
                    errorName.setVisibility(View.VISIBLE);
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
