class A
{
int x;
A()
{
x=10;
System.out.println(x);
}
A(int m,int n)
{
System.out.println(m+" "+n);
}
public static void main(String args[])
{
A s1=new A();
A s2=new A(2,3);
}
}
