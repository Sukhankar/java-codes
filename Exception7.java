class Exception7
{
public static void main(String[] args)
{
int bal=1000;
int withdrawl=3000;
try
{
if (bal<withdrawl)
{
throw new ArithmeticException("Insufficient Balance");
}
bal=bal-withdrawl;
System.out.println("Tansaction Successfully Completed!!!");
}
catch(ArithmeticException e)
{
System.out.println("Exception : "+e.getMessage());
}
System.out.println("program continue......");
}
}