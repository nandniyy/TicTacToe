public class TicTacToe {

    // Create and initialize game board
    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    /**
     * Entry point of the program.
     * Tests draw detection logic.
     */
    public static void main(String[] args) {

        // Check whether the game is a draw
        System.out.println("Is Draw? " + isDraw());
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {

        // Traverse all rows
        for (int r = 0; r < 3; r++) {

            // Traverse all columns
            for (int c = 0; c < 3; c++) {

                // Check for empty cell
                if (board[r][c] == '-') {

                    return false;
                }
            }
        }

        // No empty cells found
        return true;
    }
}
