package sudoku2;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku2 {
    
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Board game1 = new Board();
        
        System.out.println();
        
        game1.handleUserInput();
        
        if(game1.equalsEachOther(game1.getCompleteBoard(), game1.getIncompleteBoard())){
            System.out.println("You won!");
        } else {
            System.out.println("Try again, you lost.");
        }
        
    }
}
