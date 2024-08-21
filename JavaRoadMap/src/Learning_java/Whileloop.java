package Learning_java;

import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number :");
		int number=input.nextInt();
		int i=1;
		
		while(i<=number) {
			if(i%3==0||i%5==0) {
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
