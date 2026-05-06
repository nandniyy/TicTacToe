
public class TicTacToe {

    // Create 3x3 game board
    static char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', 'O'},
            {' ', 'O', ' '}
    };

    /**
     * Entry point of the program.
     * Tests the win-check logic.
     */
    public static void main(String[] args) {

        // Check whether player X has won
        System.out.println("Has X won? " + hasWon('X'));

        // Check whether player O has won
        System.out.println("Has O won? " + hasWon('O'));
    }

    /**
     * Checks all possible winning patterns for the given symbol.
     * Input: Player symbol
     * Output: true if win detected
     */
    static boolean hasWon(char symbol) {

        // Check all rows
        for (int row = 0; row < 3; row++) {

            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {

                return true;
            }
        }

        // Check all columns
        for (int column = 0; column < 3; column++) {

            if (board[0][column] == symbol &&
                board[1][column] == symbol &&
                board[2][column] == symbol) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {

            return true;
        }

        // No winning pattern found
        return false;
    }
}
