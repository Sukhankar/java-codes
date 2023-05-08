interface printable
{  
   void print();  
}  
class A50 implements printable
{  
   public void print()
   {
      System.out.println("Hello");
   }  
   public static void main(String[] args)
  {  
    A50 obj=new A50();  
    obj.print();  
   }  
}