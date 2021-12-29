package Exception;

public class TestCustomException1 {
	
    // method to check the age  
    static void validate (int age) throws InvalidAgeException
    {    
       if(age < 18){
        // throw an object of user defined exception  
        throw new InvalidAgeException("age is not valid to vote");    
       }  
       else 
       {   
        System.out.println("welcome to vote");   
       }  

    }
}