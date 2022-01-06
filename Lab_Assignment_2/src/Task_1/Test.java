package Task_1;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
        try {
                testException(num);
        } catch (Exception_1 e) {
                System.out.println(e);
        }
	}
        public static void testException(int sen)throws Exception_1,Exception_2,Exception_3 {
           
            if(sen==1) 
            {
            	throw new Exception_1("Throwing Exception 1");
            }
            else if(sen==2) 
            {
            	throw new Exception_2("Throwing Exception 2");
            }
                    
            else {
            	throw new Exception_3("Throwing Exception 3");
            }
                    
            
    }
}

