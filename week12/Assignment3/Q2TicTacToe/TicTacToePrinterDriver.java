package week12.Assignment3.Q2TicTacToe;

public class TicTacToePrinterDriver {
    public static void main(String a[]) {
        int arr[][] = {
                { -1, 0, 1 },
                { 1, 1, -1 },
                { -1, 0, 1 }
        };
        TicTacToePrinter.printBoard(arr);
    }
}