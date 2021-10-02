package encapsulation;

public class Area {

	static private double a;
	static private double b;
	static private double c;
	static private double ans;
	
	
	static void setA(double a1) {
		a=a1;
	}
	static void setB(double b1) {
		b=b1;
	}
	static void setC(double c1) {
		c=c1;
	}
	
	static void calculate() {
		double n;
		n=((a+b+c)/2);
		ans=n;
	}
	
	static double getAns() {
		return ans;
	}

	
}
