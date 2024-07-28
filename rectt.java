import java.io.*;
class rectangle
{
int length,breadth;
rectangle(int l,int b)
{
length=l;
breadth=b;
}
int area()
{
return(length*breadth);
}
}
class rectt
{
public static void main(String args[])
{
rectangle ob=new rectangle(4,8);
System.out.println("___________");
System.out.println("area of rectangle="+ob.area());
System.out.println("____________");
}
}