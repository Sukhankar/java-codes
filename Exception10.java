class Exception10 
{ 
public static void main(String[] args) 
  { 
     int a = 10, b = 5, c = 5, result; 
     try 
        { 
             result = a / (b - c); 
             System.out.println("result" + result); 
        } 
      catch (ArithmeticException e)                	
        { 
                 System.out.println(“Divide by 0 is not possible."); 
        } 
     finally 
       {  
            System.out.println("I am in final block"); 
       } 
    }  
 } 