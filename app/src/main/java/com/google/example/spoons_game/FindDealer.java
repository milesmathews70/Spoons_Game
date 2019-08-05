package com.google.example.spoons_game;
import java.util.Random;

public class FindDealer {

    private Random random;

    public FindDealer() {

        random = new Random();
    }

    public int findDealer(int numOfPlayers) {
        return (this.random.nextInt(numOfPlayers));
    }
}
