package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Player {
    private int number;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void guessNumber() throws InputMismatchException {
        PlayerInputReader inputReader = new PlayerInputReader();
        do {
            number = inputReader.requestGuess();
        } while (number == 0);
        guesses.add(number);
    }

    public int getNumber() {
        return number;
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}

class PlayerInputReader {

    public int requestGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number:");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a valid guess");
        }
        scanner.nextLine();
        return 0;
    }

}