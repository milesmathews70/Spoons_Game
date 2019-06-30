package com.example.spoons_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SignIn extends AppCompatActivity {

    String email;
    String pass;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email = findViewById(R.id.emailAdd).toString();
        pass = findViewById(R.id.passAdd).toString();

        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Use OAuth to sign in HERE, but for now, go to the welcome screen
                startActivity(new Intent(SignIn.this, WelcomeScreen.class));
            }
        });


    }
}
