package Coding Assignments.Assignment 2;

/**
 * @author Brooks Jackson
 * 03/09/23
 * This program simulates the classic Tortoise & Hare race!
 */

import java.security.SecureRandom;

public class Q2TortHare {
    public static SecureRandom random = new SecureRandom(); // random number function

    public static void printRaceTrack(int hPos, int tPos) { // race track generator function
        System.out.println();
        if (hPos == tPos && !(hPos == 0)) {
            System.out.println("OUCH!!!"); // prints "OUCH!!!" if the hare and tortoise are at the same spot
        }

        for (int counter = 0; counter < 70; counter++) {
            if (counter == hPos) { 
                System.out.print("H"); // prints an "H" wherever the hare is
            }
            else {
                System.out.print("-"); // prints a "-" wherever the hare isn't
            }
        }

        System.out.print("\n");

        for (int counter = 0; counter <= 70; counter++) {
            if (counter == tPos) {
                System.out.print("T"); // prints a "T" wherever the tortoise is
            }
            else {
                System.out.print("-"); // prints a "-" wherever the tortoise isn't
            }
        }
    }

    public static void main(String[] args) throws InterruptedException { // main function
        int hPos = 0, tPos = 0; // sets the initial positions to 0
        System.out.println("BANG!!!");
        System.out.println("AND THEY'RE OFF!!!");
        printRaceTrack(hPos, tPos); // prints the race track from before

        while (hPos < 70 && tPos < 70) {
            Thread.sleep(1000); // creates a 1 second delay in between each move

            int hMove = random.nextInt(10) + 1; // generates random numbers for possible hare moves
            int tMove = random.nextInt(10) + 1; // generates random numbers for possible tortoise moves

            if (hMove >= 1 && hMove <= 2) { // sleep, 20% chance of occurring
                hPos += 0; // No move at all
            }
            else if (hMove >= 3 && hMove <= 4) { // big hop, 20% chance of occurring
                hPos += 9; // 9 squares to the right
            }
            else if (hMove == 5) { // big slip, 10% chance of occurring
                hPos -= 12; // 12 squares to the left
            }
            else if (hMove >= 6 && hMove <= 8) { // small hop, 30% chance of occurring
                hPos += 1; // 1 square to the right
            }
            else if (hMove >= 9 && hMove <= 10) { // small slip, 20% chance of occurring
                hPos -= 2; // 2 squares to the left
            }

            if (tMove >= 1 && tMove <= 5) { // fast plod, 50% chance of occurring
                tPos += 3; // 3 squares to the right
            }
            else if (tMove >= 6 && tMove <= 7) { // slip, 20% chance of occurring
                tPos -= 6; // 6 squares to the left
            }
            else if (tMove >= 8 && tMove <= 10) { // slow plod, 30% chance of occurring
                tPos += 1; // 1 square to the right
            }

            // catch statements that make sure the tortoise or the hare never go off the edge of the track
            if (hPos > 70) {
                hPos = 70;
            }
            if (hPos < 0) {
                hPos = 0;
            }
            if (tPos > 70) {
                tPos = 70;
            }
            if (tPos < 0) {
                tPos = 0;
            }

            printRaceTrack(hPos, tPos); // prints the race track again after the move has been made

            if(hPos == 70 && tPos == 70) { // both reach 70 at the same time, resulting in a tie
                System.out.println("It's a tie!");
            }
            else if (hPos == 70) { // the hare reaches 70 first, resulting in a win for the hare
                System.out.println("The hare won the race.");
            }
            else if (tPos == 70) { // the tortoise reaches 70 first, resulting in a win for the tortoise
                System.out.println("THE TORTOISE HAS DONE THE IMPOSSIBLE!!! HE WON THE RACE!!!");
            }

        }
    }
}