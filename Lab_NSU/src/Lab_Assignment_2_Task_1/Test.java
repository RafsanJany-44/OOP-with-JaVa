package Lab_Assignment_2_Task_1;


public class Test {

	public static void main(String[] args) {
		
        try {
                testException(4);
        } catch (Exception_1 e) {
                System.out.println(e);
        }
	}
        public static void testException(int n)throws Exception_1,Exception_2,Exception_3 {
           
            if(n<10) 
            {
            	throw new Exception_1("Throwing Exception 1");
            }
            else if(n<30) 
            {
            	throw new Exception_2("Throwing Exception 2");
            }
                    
            else {
            	throw new Exception_3("Throwing Exception 3");
            }
                    
            
    }
}
