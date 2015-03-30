import java.lang.*;

public class Difference {
    
    public static void main(String []args){
        SquareOfSum squareofsum = new SquareOfSum();
        squareofsum.calculate();
        System.out.println("Sum of the squares of the first one hundred natural numbers: " + squareofsum.square);
        System.out.println("************************************************************************************");
        
        SumOfSquares sumofsquares = new SumOfSquares();
        sumofsquares.calculate();
        System.out.println("Squares of the sum of the first one hundred natural numbers: " + sumofsquares.sum);
        System.out.println("************************************************************************************");
        int difference = Math.abs(squareofsum.square - sumofsquares.sum);
        System.out.println("Difference between: " + difference);
     }
}
