package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        Scanner word = new Scanner(System.in);

        String userWord = " ";

        boolean choice = true;
        String choice2 = "yes";


        // write your code here
        /*
            Create an array which contains the 26 letters of the alphabet.
            [X] Next, prompt the user for the length of the word.
            [X] Now, select the number of random letters required
            to create a word of that length.
            [X] Print the random letters to the screen.
            [] If the random letters do not contain a vowel (a,e,i,o,u)
            then display the letters followed by "is not a word."
            [] Otherwise display the word followed by "might be a word."
            Use a while loop to allow the user to select another word.
         */

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

//        while (choice || choice2.equalsIgnoreCase("yes")) {
        while (choice) {
            // Now, select the number of random letters required
            System.out.println("Enter the length of the word");
            int userInput = word.nextInt();

            // to create a word of that length.
            // String userWord = " ";

            int randNum = 0;

            for (int i = 0; i < userInput; i++) {
                randNum = r.nextInt(alphabet.length);

                //  Print the random letters to the screen.
                System.out.print(alphabet[randNum]);

                // Saves random letters into a word.
                userWord += alphabet[randNum];
            }

            if (userWord.contains("a") || (userWord.contains("e")) || (userWord.contains("i")) ||
                    (userWord.contains("o")) || (userWord.contains("u")) || userWord.contains("y")) {
                System.out.println(" might be a word.");
            } else {
                System.out.println(" is not a word.");
            }

            System.out.println("Play again?");
                choice = word.nextBoolean();
//                choice2 = word.next();
        }

    }
}
