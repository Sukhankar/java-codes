//multi level inheritance
class Animal
{
void eat()
{
System.out.println("this is animal");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("this the dog");
}
}
class Breed
{
void type()
{
System.out.println("type is bull dog");
}
}
class Multilevel
{
public static void main(Strings[] args)

{
Breed obj=new Breed();
obj.eat();
obj.bark();
obj.type();
}
}