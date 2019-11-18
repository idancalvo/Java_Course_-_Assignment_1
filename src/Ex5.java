import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		//software receives a number and calculating the sum of the digits of the numbers that divis by 11 and multiplied them.
		Scanner scanner = new Scanner (System.in);
		int num = scanner.nextInt(); 	
		long digits_sum = 0;
		long multiplied_num = 0;
		num = num-(num%11); //check what the highest number that devis by 11
		while (num>0){
			long counter = num;
			while (0<counter){ 
				digits_sum = (counter%10)+ digits_sum;
				counter = counter/10;
			}
			num=num-11;
			if (multiplied_num>0) { // "multiplied_num" will not perform multiplication by zero
				multiplied_num=digits_sum*multiplied_num;
			}
			else {multiplied_num=digits_sum;}
			digits_sum=0;
		}
		System.out.println(multiplied_num);
	}
}

