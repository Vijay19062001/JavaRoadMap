package learning_java;

public class Methods {
	
	static void myMethod() {
		System.out.println("I just got Selected");
	}
	static void myModel(String fname) {
		System.out.println(fname +" You did not Selected");
	}
	static void myMethods() {
		System.out.println("you just Waiting list");
	}
	static int myMeth(int a) {
		return 5+a;
	}
	static int myMeths(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod();
		myModel("Arun");
		myMethods();
		System.out.println(myMeth(4));
		System.out.println(myMeths(4,5));
		

	}

}
