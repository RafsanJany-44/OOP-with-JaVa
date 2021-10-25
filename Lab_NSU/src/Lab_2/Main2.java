package Lab_2;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int flage=0;
		for(int i=2;i<num/2;i++) {
			if (num%i==0) {
				flage=1;
			}
		}
		
		if(flage==0) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime number");
		}
	}

}
