class Exception5
{
public static void main(String[] args)
{
int bal=5000;
int withdrawl=3000;
if (bal<withdrawl)
{
throw new ArithmeticException("Insufficient Balance");
}
bal=bal-withdrawl;
System.out.println("Tansaction Successfully Completed!!!");
System.out.println("program continue......");
}
}