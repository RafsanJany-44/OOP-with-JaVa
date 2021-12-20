package Task1;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
			 Scanner input = new Scanner(System.in);
			int rows = input.nextInt();
			
			for (int i=0;i<=4;i++) {
				 System.out.print(" ");
			}
			System.out.println(1);
		    for(int i = 0; i < rows; i++) {
		      for(int space = 1; space < rows - i; ++space) {
		        System.out.print(" ");
		      }
		      if (i!=2) {
		      int k;
		      for(k=1;k<=i+2;k=k+2) {
		    	  System.out.print(k);
		    	  System.out.print(" ");	      
		    	  }
		      for(int l=k;l>0;l=l-2) 
		    	  
		      {
		    	  System.out.print(l+" ");
		    	 
		      }
		    	
		    	System.out.println();
		    }
		    }
		      
		    }
		}
		
	

}
