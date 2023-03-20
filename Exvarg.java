class Exvarg 
{
void display (String... arg)
{
for (String s:arg)
{
System.out.println(s);
}
}
public static void main(String[] args)
{


Exvarg s1=new Exvarg();
s1.display("hi");

s1.display("hi","hello");

s1.display("hi","hello","welcome");

s1.display("hi","hello this the example of hello world");

s1.display("hi","hello this is the end of the program");

}
}