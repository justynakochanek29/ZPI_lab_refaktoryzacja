import java.lang.*;
public class SumOfSquares{
    
    public int sum;
    public int [] data = new int[100];
    
    public SumOfSquares(){
        for (int i=0; i<100; i++){
            this.data[i] = i;
        }
        this.sum = 0;
    }
    
    public void calculate(){
        for(int i=0;i<100; i++){
            this.sum = this.sum + this.data[i]*this.data[i];
        }
    }
}