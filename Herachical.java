class A
{
void printis()
{
System.out.println("this is class a which is perent class");
}
}
class B extends A
{
void thisb()
{
System.out.println("this is class B child class");
}
}
class C extends A
{
void thisc()
{
System.out.println("this is class C which is child class and sbling of class B ");
}
}
class Herachical
{
public static void main(String[] args)
{
B o=new B();
C j=new C();
o.printis();
o.thisb();
c.thisc();
c.printis();
}
}