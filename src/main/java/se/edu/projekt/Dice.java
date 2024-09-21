package se.edu.projekt;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        // Detta gör att spelarna kan interagera med spelet genom att mata in sina namn
        // och starta sina tärningskast
        Scanner dice = new Scanner(System.in);
        // Slumpmässiga tärningskast
        Random slump = new Random();

        // Arrays för att behålla spelarens val
        String[] playerNames = new String[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Player " + (i + 1) + ", choose a character or input your name:");
            System.out.println("1. Sofia");
            System.out.println("2. Erik");
            System.out.println("3. Sam");
            System.out.println("4. David");
            System.out.println("5. Input your name");

            int choice = dice.nextInt();
            dice.nextLine();

            String name = "";

            switch (choice) {
                case 1:
                    name = "Sofia";
                    break;
                case 2:
                    name = "Erik";
                    break;
                case 3:
                    name = "Sam";
                    break;
                case 4:
                    name = "David";
                    break;
                case 5:
                    System.out.println("Please input your name:");
                    name = dice.nextLine();
                    break;
            }

            if (i == 1 && name.equals(playerNames[0])) {
                System.out.println("Name already taken by Player 1, please choose another name.");
                i--;
            } else {
                playerNames[i] = name;
            }
        }

        System.out.println("Player 1: " + playerNames[0]);
        System.out.println("Player 2: " + playerNames[1]);
        dice.nextLine();
        System.out.println("hello " + playerNames[0] + playerNames[1] + " are you ready to play!");
    }
}




