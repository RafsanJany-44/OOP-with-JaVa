package inputOutput;
import java.util.*;
public class main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		
		Scanner in= new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		float c = in.nextFloat();
		float d= (a+b)/c;
		
		System.out.println("The ans is "+d);
		
		
	}

}
