package Learning_java;

import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		//System.out.println("Enter the students grades,Enter the negative number to stop. ");
		while(true) {
			System.out.print("Enter a grade :");
			int grade=input.nextInt();
			
			if(grade <0) {
				System.out.println("Stopping grade input");
				break;
			}
			if(grade <60) {
				continue;
			}
			System.out.println("Passing grade "+grade);
		}
		input.close();

	}

}
