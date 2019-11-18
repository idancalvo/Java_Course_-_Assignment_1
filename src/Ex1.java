public class Ex1 {
	public static void main(String[] args) {
		//The software displays all numbers divisible by 7 from 57 to 386
		int number = 57;
		while (number!=387){
			if(number%7==0){ // checking if the number is divisible by 7
				System.out.println(number);
			}
		number=number+1;
		}		
	}
}
