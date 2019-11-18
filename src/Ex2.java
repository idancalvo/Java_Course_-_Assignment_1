import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		//Several software receives and disassembles the product of prime numbers that make it. 
		Scanner scanner = new Scanner (System.in);
		int num=scanner.nextInt();
	    int div=2;
	    while (num>=div){ 
			while (num%div==0){ // checking if the number is divided.
				System.out.println(div);
				num=num/div;
			} 
			div=div+1;
		}
	}
}
