package sudoku2;
import java.util.Arrays;

public class BoardComparison {
    
    public String equalsEachOther(int[][] complete, int[][] incomplete){
        boolean isComplete = Arrays.deepEquals(complete, incomplete);
        
        if(isComplete){
            return System.out.println("You did it!");
        } else {
            return System.out.println("Nice try, do better next time.");
        }
    }
    
}
