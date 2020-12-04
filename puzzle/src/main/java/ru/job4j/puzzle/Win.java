package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        int diagonal = diagonal(board);
        if (diagonal != -1) {
            result = checkRow(board, diagonal) || checkCell(board, diagonal);
        }
        return result;
    }

    public static int diagonal(int[][] board) {
        int result = -1;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                result = index;
            }
        }
        return result;
    }

    public static boolean checkRow(int[][] board, int diagonal) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][diagonal] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkCell(int[][] board, int diagonal) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[diagonal][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
