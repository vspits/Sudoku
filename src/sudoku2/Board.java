//NADINE & VIVIAN
package sudoku2;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
    
    private final int[][] completedBoard = {
        {4,3,5,2,6,9,7,8,1},
        {6,8,2,5,7,1,4,9,3},
        {1,9,7,8,3,4,5,6,2},
        {8,2,6,1,9,5,3,4,7},
        {3,7,4,6,8,2,9,1,5},
        {9,5,1,7,4,3,6,2,8},
        {5,1,9,3,2,6,8,7,4},
        {2,4,8,9,5,7,1,3,6},
        {7,6,3,4,1,8,2,5,9}
    };
    private final int[][] incompleteBoard = {
        {0,3,0,2,6,0,7,0,1},
        {6,8,0,0,7,0,0,9,0},
        {1,9,0,8,0,4,5,0,2},
        {8,2,0,1,0,5,3,4,0},
        {0,0,4,6,0,2,9,0,5},
        {0,5,0,7,0,3,0,2,8},
        {5,0,9,3,2,6,0,7,4},
        {0,4,0,0,5,0,0,3,6},
        {7,0,3,0,1,8,2,0,9}
    };
    
    public int[][] getIncompleteBoard(){
        return this.incompleteBoard;
    }
    
    public int[][] getCompleteBoard(){
        return this.completedBoard;
    }

    public Board() {
        
        System.out.println("Below is your sudoku board. \nThe 0's are blanks for you to fill in:\n");
        printBoard();
        System.out.println("Reading left to right, please enter the numbers that "
                + "\nyou think are correct, pressing enter after each one:");
    }
    
    public void printBoard(){
        String x = "    0  1  2   3  4  5   6  7  8";
        System.out.print("\u001B[34m" + x);
        for (int i = 0; i < 9; i++) {
            System.out.println();
            if(i % 3 == 0){
                System.out.println("   -----------------------------");
            }
            System.out.printf("\u001B[35m%d\u001B[0m ", i);
            for (int j = 0; j < 9; j++){
                if(j % 3 == 0){
                    System.out.print("|");
                }
                System.out.printf("%2d ", incompleteBoard[i][j]);
            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("   -----------------------------");
        System.out.println();
    }

    public void handleUserInput() {
        Scanner input = new Scanner(System.in);
        boolean incomplete = incomplete();
        do {
            System.out.println("What coordinate would you like to change? "
                    + "(FORMAT \u001B[35mj vertical\u001B[0m - \u001B[34mi horizontal\u001B[0m: \u001B[35m0\u001B[0m \u001B[34m0\u001B[0m )"); //i vertical - j horizontal
            int getX = input.nextInt();
            int getY = input.nextInt();
            System.out.print("What number would you like to enter at the chosen coordinate? ");
            getIncompleteBoard()[getX][getY] = input.nextInt();
            printBoard();
        } while (incomplete);
    }
    
    public boolean incomplete(){
        boolean isTrue = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                if(incompleteBoard[i][j] == 0){
                    isTrue = true;
                }
            }
        }
        return isTrue;
    }
    
    public boolean equalsEachOther(int[][] complete, int[][] incomplete){
        return Arrays.deepEquals(complete, incomplete);
    }
}
