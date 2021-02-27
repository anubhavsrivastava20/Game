package com.practiceproblems;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Choose (1) - Rock, (2) - Scissors, (3) - Paper: ");
        int move1 = sc.nextInt(); //User input for move one from player

        System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, (3) - Paper: ");
        int move2 = sc.nextInt();//User input for move two from player
        game(move1, move2);
    }
    //Method for Operations
    public static void game(int move1, int move2) {
        //Declaring constant values
        final int ROCK = 1;
        final int SCISSOR = 2;
        final int PAPER = 3;

        //Conditions
        if (move1 == move2) {
            System.out.print("Tie");
        } else {
            switch (move1) {
                case ROCK:
                    if (move2 == SCISSOR)
                        System.out.print("1 wins");
                    else
                        System.out.print("2 wins");
                    break;
                case SCISSOR:
                    if (move2 == PAPER)
                        System.out.print("1 wins");
                    else
                        System.out.print("2 wins");
                    break;
                case PAPER:
                    if (move2 == ROCK)
                        System.out.print("1 wins");
                    else
                        System.out.print("2 wins");
                    break;
            }
        }
    }
}