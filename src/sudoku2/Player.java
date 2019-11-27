package sudoku2;

public class Player {
    private String firstName;
    private int numOfTimesWon = 0;
    private int numOfTimesLost = 0;
    
    public Player(String firstName)  {  
        this.firstName = firstName;
        System.out.printf("Hello %s! \n \n", firstName);
    }
    
    public void addToWon(){
        this.numOfTimesWon+=1;
    }
    
    public void addToLost(){
        this.numOfTimesLost+=1;
    }
    
    public int getNumTimesWon(){
        return this.numOfTimesWon;
    }
    
    public int getNumTimesLost(){
        return this.numOfTimesLost;
    }
}
