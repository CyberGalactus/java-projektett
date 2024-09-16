package se.edu.projekt;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner dice = new Scanner(System.in);
        Random slump = new Random();

//Exempel från håkan
//        int roll = slump.nextInt(6) + 1;
//        System.out.println("Du kastade: " + roll);

        float roll = slump.nextFloat(6) + 1;
        System.out.println("Du kastade: " + roll);
    }
}
