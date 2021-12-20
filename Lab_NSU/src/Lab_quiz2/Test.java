package Lab_quiz2;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String partNumber=input.next();
		String partDescription=input.next();;
		int quantity=input.nextInt();
		double price=input.nextDouble();
	    int month=input.nextInt();
	    int day=input.nextInt();
		int year=input.nextInt();
		Date date=new Date(quantity, quantity, quantity);
		
		
		Invoice invoice=new Invoice(partNumber,partDescription,quantity,price, date);
		
		
		System.out.println("All Info: "+invoice.toString());
		System.out.println("Total Price: "+invoice.getPrice());
		
	}
	
	

}
