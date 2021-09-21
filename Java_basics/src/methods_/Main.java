package methods_;

public class Main {
	
	
	static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	
	static float add(float a, float b) {
		return a+b;
	}
	
	static float sub(float a, float b) {
		return a-b;
	}
	
	static float mul(float a, float b) {
		return a*b;
	}
	static float div(float a, float b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		int b;
		b=factorial(6);
		System.out.println(b);
		System.out.println(add(5,6));
		System.out.println(sub(5,6));

		System.out.println(mul(5,6));

		System.out.println(div(5,6));

	}
	
	
	
	

}
