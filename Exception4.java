class Exception4
{
public static void main(String[] args)
{
try
{
System.out.println(3/0);
System.out.println("In try ");
}
catch(ArithmeticException e)
{
System.out.println("Exception: "+e.getMessage());
}
catch(NullPointerException e)
{
System.out.println("Exception: "+e.getMessage());
}
System.out.println("Hello");
}
}
