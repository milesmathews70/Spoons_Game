package com.google.example.spoons_game;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.app.AlertDialog;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import androidx.annotation.NonNull;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.*;

public class WelcomeScreen extends Activity {

    private static final String TAG = "WelcomeScreen";

    TextView errorName, welcomeTag, Name;

    TextView playerName;

    Button setRules, toMove, signOutbtn;

    Player player;

    Deck deck;

    String welcomeMessage = "Welcome to Spoons!";

    String toPlay = "Click to Play!";

    String needName = "Need a name to play!";

    String rules = "Click to see the rules!";

    String name = "Name:";

    ArrayList<Player> listOfPlayers;

    GoogleSignInAccount account = null;

    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        account = GoogleSignIn.getLastSignedInAccount(this);

        setRules = findViewById(R.id.setRules);
        toMove = findViewById(R.id.moveOn);
        welcomeTag = findViewById(R.id.welcomeTag);
        Name = findViewById(R.id.Name);
        errorName = findViewById(R.id.needName);
        playerName = findViewById(R.id.playerName);
        signOutbtn = findViewById(R.id.signOut);

        errorName.setText(needName);
        setRules.setText(rules);
        toMove.setText(toPlay);
        welcomeTag.setText(welcomeMessage);
        Name.setText(name);
        Log.d(TAG, account.getDisplayName());
        Log.d(TAG, account.getEmail());
        playerName.setText(account.getDisplayName());

        mGoogleSignInClient = GoogleSignIn.getClient(this,
                GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);

        toMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    deck = new Deck();

                    player = new Player(playerName.toString(), deck);



                    Intent newIntent = new Intent(WelcomeScreen.this, SevenSpoons.class);
                    newIntent.putExtra("host", player);
                    newIntent.putExtra("round", "Round ");
                    newIntent.putExtra("num", 1);
                    startActivity(newIntent);
            }
        });

        setRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, Rules.class));
            }
        });

        signOutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });
    }

    public void signOut() {
        Log.d(TAG, "signOut()");

        mGoogleSignInClient.signOut().addOnCompleteListener(this,
                new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if (task.isSuccessful()) {
                            Log.d(TAG, "signOut(): success");
                        } else {
                            Toast.makeText(WelcomeScreen.this,
                                    task.getException() + " signOut() failed!",
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                        startActivity(new Intent(WelcomeScreen.this, SignIn.class));
                    }
                });
    }
}
