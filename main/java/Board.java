public class Board {
    private char[][] board;
    private char whoseTurn = 'X';

    public Board() {
        // TODO: Initialize the 3x3 board to all empty values
    }

    public boolean isFull() {
        // TODO: Returns false is any cell in the board is EMPTY, else return true
        return false;
    }

    public void switchActivePlayer() {
        // TODO: If whoseTurn is X make it O, and vice versa
    }

    public void placeToken(int i, int j) {
        /* TODO: Place a token on the board
        You can assume that i and j are valid indices
        And that the cell is currently unfilled.
         */
    }

    public char whichPlayer() {
        // TODO return whose turn it is
        return ' ';
    }

    public String toString() {
        /*
        Using a StringBuilder, build a string representation of the board state
         */
        return "";
    }

}
