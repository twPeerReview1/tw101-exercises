package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Game {

    private final int NUMBER = new Random().nextInt(100)+1;
    private Player player;

    public Game() {
        player = new Player();
    }

    private void evaluateGuess(int guess){
        System.out.println((NUMBER < guess ? "Too high" : "Too low"));
    }

    public void play() {
        player.guessNumber();
        while (NUMBER != player.getGuess()) {
            evaluateGuess(player.getGuess());
            player.guessNumber();
        }
        System.out.println("You win!");
        System.out.println("Guesses: " + player.getGuesses());
    }
}
