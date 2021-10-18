package com.kiranthepro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static int boardWidth = 8;
    private static int boardHeight = 10;

    private static int maxCoins = 100;

    private static int[] treasureLocation = {random.nextInt(boardHeight), random.nextInt(boardWidth)};

    private static String [][] board;

    private static boolean foundTreasure = false;

    public static void setupBoard() {
        board = new String[boardHeight][boardWidth];

        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardWidth; j++) {
                if ((i != treasureLocation[0]) && (i != treasureLocation[1])) {
                    int coinsToStore = random.nextInt(maxCoins);
                    board[i][j] = "[" + coinsToStore + "]";
                    System.out.print(board[i][j]);
                }

            }
            System.out.println();
        }
    }

    public static void displayBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] getGuess() {
        System.out.println("Type where you think the treasure is in the form x y:");
        String[] input = scanner.nextLine().split(" ");
        return new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
    }

    public static void evaluateGuess(int[] guess) {
        System.out.println(Arrays.toString(guess));
        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardWidth; j++) {
                // if something, found treasure = true
            }
        }
    }

    public static void main(String[] args) {
	    // write your code here
        setupBoard();
        displayBoard();
        while (!foundTreasure) {
            evaluateGuess(getGuess());
        }

        System.out.println("You found the treasure!");

    }


}
