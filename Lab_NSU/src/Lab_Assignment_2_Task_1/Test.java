package Lab_Assignment_2_Task_1;

public class Test {

	public static void main(String[] args) {
        try {
                testException(4);
        } catch (ExceptionA e) {
                System.out.println(e);
        }
	}
        public static void testException(int n)throws ExceptionC,ExceptionB,ExceptionA {
           
            if(n<10) 
            {
            	throw new ExceptionA("Throwing Exception 1");
            }
            else if(n<30) 
            {
            	throw new ExceptionB("Throwing Exception 2");
            }
                    
            else {
            	throw new ExceptionC("Throwing Exception 3");
            }
                    
            
    }
}
