import java.util.Random;

public class TicTacToe_UC7{

    public static void computerMove(char[] board, char computerSymbol) {
        Random random = new Random();
        int computerSlot;
        boolean isValid = false;

        System.out.println("Computer is thinking...");

        while (!isValid) {
            // Generate random number between 0 and 8
            computerSlot = random.nextInt(9);

            // Check if the slot is empty
            if (board[computerSlot] == ' ') {
                // Place the move
                board[computerSlot] = computerSymbol;

                // Print position in user-friendly format (1–9)
                System.out.println("Computer placed '" + computerSymbol +
                                   "' at position " + (computerSlot + 1));

                isValid = true;
            }
        }
    }

    public static void main(String[] args) {
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        computerMove(board, 'O');
    }
}
