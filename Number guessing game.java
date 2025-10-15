import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        while (userGuess != numberToGuess) {
            System.out.print("En
