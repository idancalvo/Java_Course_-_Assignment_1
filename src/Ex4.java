import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		//Taking a number from user and print the Fibonacci sequence.
		Scanner scanner = new Scanner (System.in);
		long elementnum = scanner.nextInt();
		long num_Fibonacci = 1;
		long Counter1 = 0 ,Counter2 = 1; // counter1 + counter2 saving the last 2 numbers in Fibonacci seqence.
		while (elementnum>0){ 
			System.out.println(num_Fibonacci);
			Counter1=num_Fibonacci;
			num_Fibonacci=Counter2;
			Counter2=num_Fibonacci+Counter1;
			elementnum=elementnum-1;
		}
	}
}
