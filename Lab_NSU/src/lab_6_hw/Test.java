package lab_6_hw;

public class Test {

	public static void main(String[] args) {
		Fraction f1= new Fraction(1,4);
		Fraction f2= new Fraction(3,5);
		
		System.out.println("The Addition:");
		f1.add(f2);
		
		
		Fraction f3= new Fraction(1,4);
		Fraction f4= new Fraction(3,5);
		System.out.println("The Subtraction:");
		f3.sub(f4);
		
		
		Fraction f5= new Fraction(1,4);
		Fraction f6= new Fraction(3,5);
		System.out.println("The Multiplication:");
		f5.multiplication(f6);
		
		
		Fraction f7= new Fraction(1,4);
		Fraction f8= new Fraction(3,5);
		System.out.println("The Devision:");
		f7.division(f8);
		
		
	}

}
