package java_week1;

import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int specificNumber=40;
		while(true) {
			System.out.print("Enter the number :");
			int number = input.nextInt();
			
			if(number==specificNumber) {
				System.out.print("You have found the specific number "+specificNumber);
				break;
			}
			System.out.println("The number " + number + " is not the specific number. Try again.");
			
			
		}
		input.close();
	}

}
