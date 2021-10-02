package encapsulation;
// with out encapsulation
public class Area2 {
	
	static double a;
	static double b;
	static double c;
	static double ans;
	
    Area2(double a1, double b1, double c1){
		a=a1;
		b=b1;
		c=c1;
	}
    
    static double calculate() {
    	ans =(a+b+c)/2;
    	return ans;
    }

}
