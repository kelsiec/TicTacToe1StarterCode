public class Game {
    public void play() {
        /* TODO Create a Board instance,
            a Scanner for user input
            and a flag to check whether the user asked to quit
         */

        // TODO Loop while the board is not full, and the user has not asked ot quit

            /* TODO print out whose turn it is and
                ask for user input - either an x/y coordinate pair or "quit"
             */

            /* TODO use the user input.
                if the user said quit flip the flag
                else parse the x y coordinate,
                    place the token,
                    and switch whose turn it is
             */

            // TODO Print out the current board state

        // TODO: If the board is full, say so
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Welcome to tic tac toe!");
        game.play();
    }
}
