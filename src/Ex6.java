import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) { // Counting the number of squares with odd size that can fit in the big square.
    Scanner scanner = new Scanner (System.in);
    int squaresize;
    int sum=0;
    int smallsquare;
    squaresize=scanner.nextInt();
    smallsquare=squaresize;
    while (smallsquare>=1){ 
    	if (smallsquare%2==0){ // checking if the small square is even number size.
    		smallsquare--;
    	} else {
    		sum=(int) (sum+Math.pow((squaresize-smallsquare+1),2));
			// the formula for how many squares fit is: (big square - samll square + 1)^2
    		smallsquare--;
    	}
    }
    System.out.println(sum);
	}
}
