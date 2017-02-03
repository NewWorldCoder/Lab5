package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int die1;
        int die2;
        int n;
        String userInput;
        int rollOutcome = 1;
        int counter = 0;

        System.out.println("Welcome to the Grand Circus Casino!");

        System.out.println();

        do {

            System.out.println("How many sides does the pair of dice have?");

            n = scan.nextInt();

            die1 = roll(n);
            die2 = roll(n);

            System.out.println("Roll: " + rollOutcome++);
            System.out.println("Die one:  " + die1);
            System.out.println("Die one:  " + die2);
            System.out.println();

            System.out.println("Would you like to continue? yes/no");
            scan.nextLine();
            userInput = scan.nextLine();

        }
            while (userInput.equalsIgnoreCase("yes"));
            System.out.println();
            System.out.println("Goodbye!");

    }

    private static int roll(int n) {
        return (int) (Math.random() * n) + 1;

    }

        }
