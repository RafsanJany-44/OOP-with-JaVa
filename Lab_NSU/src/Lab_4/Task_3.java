package Lab_4;
import java.util.*;
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
		int matrix[][] = 
		      { { 3, 4, 9 }, { 2, 9, 11 }, { 4, 6, 0 } };
		
		int diagon1=0;
		int diagon2=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					diagon1=diagon1+matrix[i][j];
				}
				
				if(Math.abs(i-j)==2 || i-j==0) {
					System.out.println(diagon2);
					diagon2=diagon2+matrix[i][j];
				}
			}
		}
		System.out.println(diagon1+" "+diagon2);
		
		
	}

}
