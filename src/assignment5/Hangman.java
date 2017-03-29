/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author shebm3906
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input from players
        Scanner input = new Scanner(System.in);
        // ask player 1 to enter a word, then scan it in and find the length
        System.out.println("Player 1: Enter a word for Player 2 to guess:");
        String word = input.nextLine();
        int wordlength = word.length();

        int life = 6;



        while (true) {

            // blank lines
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            // output number of dashes equal to number of letters in word entered
            String dash = "-";
            String hidden = "";
            for (int i = 0; i < wordlength; i++) {
                System.out.print(hidden + dash);
            }
            System.out.println("");

            String guess = input.nextLine();

            word.indexOf(guess);

            if (word.indexOf(guess) < 0) {
                life = life - 1;
                System.out.println("");

                if (life >= 1) {
                    System.out.println("Player 2: You have " + life + " lives left. Guess a letter:");


                    if (life == 0) {
                        System.out.println("Player 2 has lost.");
                        break;
                   
                    }if (word.indexOf(guess) >= 0) {
                        word.replace(dash, guess);
                    }
                }
            }
        }
    }
}
