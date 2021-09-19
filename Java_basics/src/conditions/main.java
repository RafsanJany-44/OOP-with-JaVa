package conditions;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int a = sc.nextInt();
		int c = sc.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		if(100<=b && b<=1000) {
			System.out.println("The numbr "+b+" is in range 100 to 1000");
		}
		else if (1000<b && b<=2000) {
			System.out.println("The numbr "+b+" is in range 1000 to 2000");
		}
		else {
			System.out.println("Out of range");
		}
		 switch(c) {
		 case 1:
			 System.out.println(c);
			 break;
		 case 100:
			 System.out.println(c);
			 break;
		 case 7:
			 System.out.println(c);
			 break;
			 
		 case 2:
			 System.out.println(c);
			 break;
		 case 3:
			 System.out.println(c);
			 break;
		 case 4:
			 System.out.println(c);
			 break;
		 case 5:
			 System.out.println(c);
			 break;
		 case 6:
			 System.out.println(c);
			 break;
		 default:
			 System.out.println("Its switch case defalut value");
		 }
		
	}

}
