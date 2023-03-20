class Varag 
{
int sumnumber(int... arg)
{
int sum=0;
for (int x:arg)
{
sum =sum+x;
}
return sum;
}
public static void main(String[] args)
{
Varag obj=new Varag();
System.out.println(obj.sumnumber(21,22));
System.out.println(obj.sumnumber(2,2982));
System.out.println(obj.sumnumber(216,202));
System.out.println(obj.sumnumber(261,622));
System.out.println(obj.sumnumber(211,222));
System.out.println(obj.sumnumber(219,922));
}
}