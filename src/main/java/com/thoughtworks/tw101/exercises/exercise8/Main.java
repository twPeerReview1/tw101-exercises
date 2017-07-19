package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses - done
// and print them out once they guess correctly. -done
// Use an ArrayList to store the guesses. -done
// Catch the NumberFormatException and handle the case -done
// where the user entered a String that is not parseable.

/*** --------------------- Identified Smells ------------------------- ***/
/* Dispenser 1:
 *
 * Dispenser 2:
 *
 * Bloater 1:
 *  Long method in Player class.
 *  Refactored by extracting a new method requestGuess().
 *
 * Bloater 2:
 *  Long parameter list in main method of this module.
 *  Initially created an instance of Player and passed it to the Game constructor.
 *  Refactored by replacing the Player instance and Game constructor call parameter
 *  and instead creating a Player instance in the Game class constructor.
 *
 * OO Abuser 1:
 *
 */

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.play();
    }
}
