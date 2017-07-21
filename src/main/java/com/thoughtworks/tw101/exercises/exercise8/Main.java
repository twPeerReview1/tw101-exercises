package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses - done
// and print them out once they guess correctly. -done
// Use an ArrayList to store the guesses. -done
// Catch the NumberFormatException and handle the case -done
// where the user entered a String that is not parseable.

/*** --------------------- Identified Smells ------------------------- ***/
/* Dispenser 1:
 *  Both the Game and Player classes had an instance variable named 'number', which
 *  could use comments to differentiate.
 *  Instead, I refactored by renaming the variable in the Player class 'guessedNumber',
 *  and renaming its corresponding getter method to 'getGuess()'.
 *
 * Dispenser 2:
 *  The value stored in the instance variable guess from the Player class is already
 *  stored in the ArrayList guesses.
 *  I eliminated the dead instance variable and updated its getter method to extract
 *  the value from 'guesses'.
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
 *  There is a Scanner object instance variable in the Player class that is
 *  only used in one method. This is a temporary field that doesn't need to be
 *  kept track of.
 *  Refactored by creating a new PlayerInputReader class with the single method
 *  requestGuess. Alternatively, I could have left the method requestGuess() in the
 *  class, removed the Scanner instance variable, and instantiated it within the
 *  method.
 */

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.play();
    }
}
