package Task;
import java.util.*;

public class Task1_CodSOft {
    public static void main(String[] args) {
        playNumberGame();
    }

    private static void playNumberGame() {
        final int MAX_GUESSES = 5;
        final int MAX_NUMBER = 100;

        Random random = new Random();
        int randNum = random.nextInt(MAX_NUMBER) + 1;

        Scanner sc = new Scanner(System.in);

        for (int guess = MAX_GUESSES; guess > 0; guess--) {
            System.out.println("Guess a number between 1-" + MAX_NUMBER);
            System.out.println("You have " + guess + " guess" + (guess > 1 ? "es" : "") + " left");

            int num = sc.nextInt();

            if (num == randNum) {
                System.out.println("Correct Guess!\nThe number is " + num);
                return; // Exit the game if the guess is correct
            } else if (num > randNum) {
                System.out.println("The number " + num + " is too high");
            } else {
                System.out.println("The number " + num + " is too low");
            }
        }

        System.out.println("Oops! You've run out of guesses.");
        System.out.println("The correct number was " + randNum);
    }
}
