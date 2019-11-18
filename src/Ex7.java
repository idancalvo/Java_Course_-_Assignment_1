import java.util.Scanner;
public class Ex7 {
	public static void main (String args[]){
		//making a hourglass made of "*" with costume height
		Scanner scanner = new Scanner (System.in);
		int height_hourglass = scanner.nextInt();
		if (height_hourglass>0){ //Checking that the user enter a number that bigger then zero
			int linebreak1=height_hourglass;
			height_hourglass=height_hourglass*2-1; // the size of the first line of "*" and height of the hourglass
			int spacer=0;
			int linebreak2=linebreak1; 
			while (linebreak1>1){ //the first part of the hourglass (until one *)
				while (spacer>0) { // making the spaces
					System.out.print(" ");
					spacer=spacer-1;
				}	
				while (height_hourglass>0) { // making the "*"
					System.out.print ("*");
					height_hourglass=height_hourglass-1;
				}
				height_hourglass=linebreak1*2-3;
				linebreak1=linebreak1-1;
				spacer=spacer+(linebreak2-linebreak1);
				System.out.println();
			}
			height_hourglass=1;
			while (linebreak2>0){//the second part of the hourglass (from one *)
				while (spacer>0) {// making the spaces
					System.out.print(" ");
					spacer=spacer-1;
				}
				while (height_hourglass>0){// making the "*"
					System.out.print ("*");
					height_hourglass=height_hourglass-1;
				}
				System.out.println();
				linebreak1=linebreak1+1;
				height_hourglass=linebreak1*2-1;
				linebreak2=linebreak2-1;
				spacer=spacer+(linebreak2-1);
			}
		}
		else {
		System.out.println("illegal input");
		}
	}	
}
