package Stuff.RandNumGuesser;

import java.lang.Math;
import java.util.Scanner;

public class randNumGuesser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wrongCount = 1;
        int randNum = (int) (Math.random() * 10) + 1;

        System.out.println("\nGuess a number from 1 to 10!");
        while (scan.nextInt() != randNum) {
            wrongCount++;
            System.out.println("Try again!");
        }
        System.out.println("Correct! You took " + wrongCount + " tries to guess the right number!");
        scan.close();
    }
}