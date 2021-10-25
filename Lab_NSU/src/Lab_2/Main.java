package Lab_2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		int n=num%2;
		
		switch (n) {
		case 0:
		System.out.println("This is an even number");
		break;
		case 1:
		System.out.println("This is an odd number");
		}

	}

}
