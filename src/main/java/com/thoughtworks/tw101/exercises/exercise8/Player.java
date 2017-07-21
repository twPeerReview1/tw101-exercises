package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Player {
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void guessNumber() throws InputMismatchException {
        PlayerInputReader inputReader = new PlayerInputReader();
        int guess = 0;
        do {
            guess = inputReader.requestGuess();
        } while (guess == 0);
        guesses.add(guess);
    }

    public int getGuess() {
        return guesses.get(guesses.size()-1);
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}

class PlayerInputReader {

    public int requestGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a guess:");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a valid guess");
        }
        scanner.nextLine();
        return 0;
    }

}