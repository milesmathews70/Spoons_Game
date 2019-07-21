package com.example.spoons_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class Rules extends AppCompatActivity {

    TextView rules;

    String gameRules = "For the game of spoons, the goal is, of course, to grab a spoon. However," +
            " to get a spoon, one must have 4 of the same cards, ex: a 4 of Diamonds, Spades, Hearts, " +
            "and Clubs. Or, when someone else grabs a spoon, you can then grab a spoon. " +
            "While you can only hold 4 cards at a time, cards are passed around the table, and you can swap a " +
            "card that is being passed with a card in your hand. You only have 3 seconds to swap a card or not!" +
            " Good luck!";

    Button toHome;

    String goHome = "Back to the home screen!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        rules = findViewById(R.id.rules);
        toHome = findViewById(R.id.home);

        rules.setText(gameRules);
        toHome.setText(goHome);

        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rules.this, WelcomeScreen.class));
            }
        });

    }


}
