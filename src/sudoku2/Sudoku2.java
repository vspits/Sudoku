package sudoku2;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku2 {
    
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Board game1 = new Board();
        System.out.println();
        game1.handleUserInput();
    }
    
    public boolean equalsEachOther(int[][] complete, int[][] incomplete){
        return Arrays.deepEquals(complete, incomplete);
    }
}
