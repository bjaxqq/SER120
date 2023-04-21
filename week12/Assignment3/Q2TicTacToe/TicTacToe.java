package week12.Assignment3.Q2TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private int[][] grid;
    private int player; // 1 for X, -1 for O
    private Scanner scanner;

    public TicTacToe() {
        grid = new int[3][3];
        player = 1;
        scanner = new Scanner(System.in);
    }

    public void play() {
        boolean finished = false;
        while (!finished) {
            printBoard();
    
            int row, col;
            do {
                System.out.printf("Player %s, enter row and column (0-2) separated by a space: ", player == 1 ? "X" : "O");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!validMove(row, col));
    
            grid[row][col] = player;
    
            if(win()) {
                printBoard();
                System.out.printf("Player %s wins!\n", player == 1 ? "X" : "O");
    
                // Prompt the user to play again
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Play again? (Y/N): ");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("Y")) {
                        reset();
                        validInput = true;
                    } else if (answer.equalsIgnoreCase("N")) {
                        finished = true;
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
                }
            } 
            else if(draw()) {
                printBoard();
                System.out.println("It's a draw!");
    
                // Prompt the user to play again
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Play again? (Y/N): ");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("Y")) {
                        reset();
                        validInput = true;
                    } else if (answer.equalsIgnoreCase("N")) {
                        finished = true;
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y or N.");
                    }
                }
            } 
            else {
                player *= -1;
            }
        }
    }    

    private void printBoard() {
        TicTacToePrinter.printBoard(grid);
    }

    private boolean validMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid square.");
            return false;
        }
        if (grid[row][col] != 0) {
            System.out.println("The square is taken. Choose again.");
            return false;
        }
        return true;
    }

    private boolean win() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] == player && grid[row][1] == player && grid[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] == player && grid[1][col] == player && grid[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
        }

        return false;
    }

    private boolean draw() {
        for (int[] row : grid) {
            for (int square : row) {
                if (square == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void reset() {
        grid = new int[3][3];
        player = 1;
    }
}
