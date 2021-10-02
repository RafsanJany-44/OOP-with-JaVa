package constructor;

public class Area {
	
	static double a;
	static double b;
    static double c;
	Area(double a1, double b2, double c3){
		a=a1;
		b=b2;
		c=c3;
	}
	
	static double calculte() {
		double s= (a+b+c)/2;
		return s;
	}
	

}
