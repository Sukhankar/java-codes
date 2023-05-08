class Base 
{
void printis()
{
System.out.println("this is parent class");
}
class Child
{
viod printis()
{
super.printis();
System.out.println("this is base class ");
}
}
class Overridingin
{
pubilc satatic void main(String[] args)
{
Child obj=new Child();
obj.printis();
}
}