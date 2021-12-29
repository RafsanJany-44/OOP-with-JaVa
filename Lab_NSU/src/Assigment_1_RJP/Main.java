package Assigment_1_RJP;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		RoboGrid r1=new RoboGrid("Melissa",15,40);
		RoboGrid r2=new RoboGrid("Bob",44,20);
		r1.moveRight(7);
		r2.moveUp(11);
		System.out.println(r1.toString());

		System.out.println(r2.toString());

	}

}
