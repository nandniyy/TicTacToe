import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe_UC2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program.
     * Executes the toss logic and displays the result.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. Initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and
     * which symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("Toss Result:");

        System.out.println("Human is '" + humanSymbol + "'");
        System.out.println("Computer is '" + computerSymbol + "'");

        if (isHumanTurn) {
            System.out.println("Human starts first");
        } else {
            System.out.println("Computer starts first");
        }
    }
}
