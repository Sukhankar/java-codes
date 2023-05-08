class A
{
void add()
{
int a=10,b=20;
}
}
class B
{
void add()
{
super.a;
super.b;
int c;
c=a+b;
System.out.println("addition is "+c);
}
}
class Supervariable
{
public static void main(String[] args)
{
B obj=new B();
obj.add();
}
}

