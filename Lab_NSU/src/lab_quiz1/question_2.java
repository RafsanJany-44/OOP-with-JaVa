package lab_quiz1;
import java.util.*;
public class question_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.next();
	    s = s.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s);
		
		
	}

}
