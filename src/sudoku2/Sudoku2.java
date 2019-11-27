package sudoku2;
import java.util.Scanner;

public class Sudoku2 {
    
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        
        Player player1 = new Player(firstName);
        Board game1 = new Board();
        
        System.out.println();
        
        game1.handleUserInput();
        
        if(game1.equalsEachOther(game1.getCompleteBoard(), game1.getIncompleteBoard())){
            System.out.println("You won!");
            player1.addToWon();
            System.out.printf("Player won %d times & lost %d times.\n", player1.getNumTimesWon(), player1.getNumTimesLost());
        } else {
            System.out.println("Try again, you lost.");
            player1.addToLost();
            System.out.printf("Player won %d times & lost %d times.\n", player1.getNumTimesWon(), player1.getNumTimesLost());
        }
    }
}
