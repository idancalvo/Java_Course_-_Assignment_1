import java.lang.Math;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		/*The software receives a group of numbers and selects from them the two maximum evens 
		and two maximum odds and do Geometric-mean between the selected numbers*/
		Scanner scanner = new Scanner (System.in);
		double num = scanner.nextInt(); //Auxiliary variable.
		int odd1=1,odd2=0; //Variables that Save odds numbers .
		int even1=1,even2=0; //Variable that Save evens numbers .
		while(num>0){
			int x=0;
			if(num%2==0){  //Checking if the number is even or odd.
				if(num>even1||num>even2){ // Checking if the number is bigger then the preious even numbers.
					x=Math.max(even1,even2);
					even1= (int)num;
					even2=x;
				}
			}	
			else {
				if(num>odd1||num>odd2){ // Checking if the number is bigger then the preious odd numbers.
					x=Math.max(odd1,odd2);
					odd1= (int)num;
					odd2=x;		
				}
			}	
			num = scanner.nextInt();
		}
		num = (float)Math.pow((odd1*odd2*even1*even2),0.25);
		//Calculate Geometric-mean Between the 4 saved numbers. 
		System.out.format("%.3f",num);
	}
	
}
