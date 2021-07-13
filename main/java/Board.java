public class Board {
    private static final int EMPTY = -1;
    private static final int O = 0;
    private static final int X = 1;

    private int[][] board;
    private int whoseTurn = X;

    public Board() {
        // TODO: Initialize the 3x3 board to all empty values
    }

    public boolean isFull() {
        // TODO: Returns false is any cell in the board is EMPTY, else return true
        return false;
    }

    public void switchActivePlayer() {
        // TODO: If whoseTurn is X make it Y, and vice versa
    }

    public void placeToken(int i, int j) {
        /* TODO: Place a token on the board
        You can assume that i and j are valid indices
        And that the cell is currently unfilled.
         */
    }

    public String whichPlayer() {
        /*
        Public wrapper for whichPlayer(int value), since
        users don't have the integer value of the current player
        Pass along whoseTurn to the overloaded function
         */
        return "";
    }

    private String whichPlayer(int value) {
        /*
        TODO: Convert the integer value of the player to a readable string
        0 => "O", 1 => "X", -1 is empty
         */
        return "";
    }

    public String toString() {
        /*
        Using a StringBuilder, build a string representation of the board state
         */
        return "";
    }

}
