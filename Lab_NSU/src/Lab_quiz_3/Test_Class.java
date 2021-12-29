package Lab_quiz_3;
import java.util.*;
public class Test_Class {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String fruit1=input.next();
		String color1=input.next();
		String fruit2=input.next();
		String color2=input.next();
		
		Pineapple pine=new Pineapple(fruit1,color1);
		Pear pear =new Pear(fruit2,color2);
		
		System.out.println(pine.toString());
		pine.howToCook();
		pine.taste();
		
		
		
		System.out.println(pear.toString());
		pear.howToCook();
		pear.taste();
		
		
		
		
		
	}

}
