import java.lang.*;

public class SquareOfSum{
    
    public int square;
    public int [] data = new int[100];
    
    public SquareOfSum(){
        for (int i=0; i<100; i++){
            this.data[i] = i;
        }
        this.square = 0;
    }
    
    public void calculate(){
        int sum = 0;
        for(int i=0;i<100; i++){
            sum = sum + this.data[i];
        }
        this.square = sum*sum;
    }
}
