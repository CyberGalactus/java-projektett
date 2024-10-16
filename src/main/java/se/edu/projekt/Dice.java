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
            System.out.println("Player choose a character or input your name:"); // ungäfer som console.log()
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
// andra loppen
            if (i == 1 && name.equals(playerNames[0])) { // name.equals(playerNames[0]) Kontrollerar om spelare 2 har
                // valt samma namn som den första spelaren
                System.out.println("Name already taken by Player 1, please choose another name.");
                i--; // i kommer att minska på 1 så att loppen upprepar samma fråga tills du har valt unik namn
            } else {
                playerNames[i] = name; //här väljer spelare 2 unik namn och det lagras i playernames arrayen
            }
        }
        Player player1 = new Player(playerNames[0]);
        Player player2 = new Player(playerNames[1]);

        System.out.println("Player 1: " + player1.getName());
        System.out.println("Player 2: " + player2.getName());
        System.out.println("hello " + playerNames[0] + " and " + playerNames[1] + " are you ready to play!\n");
        dice.nextLine();


        int roll = slump.nextInt(6) + 1; // Ger ett tal mellan 1 och 6 System.out.println("Du kastade: " + roll);
        System.out.println("Player 1: " + player1.getName() + " slår första kastet och får en "  + roll);
        dice.nextLine();
        int rolle = slump.nextInt(6) + 1;
        System.out.println("Player 2: " + player2.getName() + " slår första kastet och får en " + rolle);
        dice.nextLine();
        int roller = slump.nextInt(6) + 1;

        System.out.println("Player 1: " + player1.getName() + " slår andra kastet och får en "  + roller);
        dice.nextLine();
        int rolleer = slump.nextInt(6) + 1;
        System.out.println("Player 2: " + player2.getName() + " slår andra kastet och får en " + rolleer);
        dice.nextLine();

        // visar dem som vann
        int total1 = roll + roller;
        int total2 = rolle + rolleer;

        System.out.println("spelare 1: " + player1.getName() + " får " + total1);
        System.out.println("spelare 2: " + player2.getName() + " får " + total2);

        if (total1 > total2) {
            System.out.println("spelare 1: " + player1.getName() + " Vinner spelet ");
        } else if (total1 < total2) {
            System.out.println("spelare 2: " + player2.getName() + " Vinner spelet ");
        } else {
            System.out.println("det är oavgjort, Game over!");
        }
    }
}




