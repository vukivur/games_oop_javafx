package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkRow(board) || checkCell(board);
    }

    public static boolean checkRow(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            int count = 0;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 1) {
                    count++;
                }
            }
            if (count == 5) {
                result = true;
            }
        }
        return result;
    }

    public static boolean checkCell(int[][] board) {
        boolean result = false;
        for (int cell = 0; cell < board.length; cell++) {
            int count = 0;
            for (int row = 0; row < board.length; row++) {
                if (board[row][cell] == 1) {
                    count++;
                }
            }
            if (count == 5) {
                result = true;
            }
        }
        return result;
    }
}
