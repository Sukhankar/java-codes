//Aruguments passing

class Exargu
{ int data=50;  
   void change(int data)
   {  
      data=data+100; //changes will be in the local variable only  
   }  
     
   public static void main(String args[])
   {  
      Exargu op=new Exargu(); 
      System.out.println("after change "+op.data);  

      op.change(100);  
 
      System.out.println("before change "+op.change);
}
}
