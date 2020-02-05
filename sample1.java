class sample2
{
void area(int a,int b)
{
System.out.println("Product="+(a*b));
}
static void area()
{ int x=3;
  int y=4;
  System.out.println("Sum="+(x+y));
}
}
class sample1
{
public static void main(String args[])
{

sample2 obj=new sample2();
obj.area(3,4);
obj.area();
}
}
