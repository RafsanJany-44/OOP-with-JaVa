package Assigment_1_RJP;

public class Task2 {

	public static void main(String[] args) {    
	      int m = (int)Math.floor(Math.random()*(10-5+1)+5);
	        
	      int n = (int)Math.floor(Math.random()*(10-2+1)+2);
	      
	    
	      
        int b[][] = new int[m][n];
        
        
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = (int)Math.floor(Math.random()*(99-11+1)+11);                }
            }
         

            int sum=0;
            for(int i = 0; i < n; i++){    
                sum = 0;    
                for(int j = 0; j < m; j++){    
                  sum = sum + b[j][i];    
                }    
                System.out.println("Sum of " + (i+1) +" column: " + sum);    
            }   
        
	}

}
