package week12.Assignment3.Q2TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    private int[][] board;
    private int currentPlayer;
    private boolean gameFinished;

    public TicTacToe() {
        board = new int[3][3];
        currentPlayer = 1;
        gameFinished = false;
        initializeBoard();
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        while (!gameFinished) {
            TicTacToePrinter.printBoard(board);
            System.out.println("Player " + (currentPlayer == 1 ? "X" : "O") + ", enter row (0-2): ");
            int row = input.nextInt();
            System.out.println("Player " + (currentPlayer == 1 ? "X" : "O") + ", enter column (0-2): ");
            int col = input.nextInt();
            if (makeMove(row, col)) {
                if (checkWin()) {
                    TicTacToePrinter.printBoard(board);
                    System.out.println("Player " + (currentPlayer == 1 ? "X" : "O") + " wins!");
                    gameFinished = true;
                } else if (checkDraw()) {
                    TicTacToePrinter.printBoard(board);
                    System.out.println("It's a draw!");
                    initializeBoard();
                } else {
                    currentPlayer *= -1;
                }
            } else {
                System.out.println("That square is already taken. Try again.");
            }
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
    }

    private boolean makeMove(int row, int col) {
        if (board[row][col] == 0) {
            board[row][col] = currentPlayer;
            return true;
        } else {
            return false;
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[2][0] != 0 && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return true;
        }
        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
