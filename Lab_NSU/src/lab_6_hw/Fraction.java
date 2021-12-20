package lab_6_hw;

public class Fraction {
	
	private static int numerator;
	private static int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator=numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator=denominator;
	}
	
	public String toString() {
		
		return numerator + "/" + denominator;
	}
	
	public void add(Fraction fraction) {
		int a = this.numerator;
        int b = this.denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        this.numerator=((a*d) + (c*b));
        this.denominator=(b*d);
        System.out.println(fraction.toString());
	}
	
	public void sub(Fraction fraction) {
		int a = this.numerator;
        int b = this.denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        this.numerator=((a*d) - (c*b));
        this.denominator=(b*d);
        System.out.println(fraction.toString());
	}
	
	
	public void multiplication(Fraction fraction) {
		int a = this.numerator;
        int b = this.denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        this.numerator=(a*c);
        this.denominator=(b*d);
        System.out.println(fraction.toString());
	}
	
	public void division(Fraction fraction) {
		int a = this.numerator;
        int b = this.denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        this.numerator=(a*d);
        this.denominator=(b*c);
        System.out.println(fraction.toString());
	}
	
}
