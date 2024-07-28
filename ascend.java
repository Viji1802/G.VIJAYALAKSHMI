import java.io.*;
class ascend
{
public static void main(String args[])throws IOException
{
int i,j,n,temp;
int t[]=new int[8];
BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements:");
n=Integer.parseInt(k.readLine());
System.out.println("Enter the elements one by one");
for(i=0;i<n;i++)
{
t[i]=Integer.parseInt(k.readLine());
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(t[i]>t[j])
{
temp=t[i];
t[i]=t[j];
t[j]=temp;
}
}
}
System.out.println("Ascending order");
System.out.println("_______________");
for(i=0;i<n;i++)
{
System.out.println(t[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(t[i]<t[j])
{
temp=t[i];
t[i]=t[j];
t[j]=temp;
}
}
}
System.out.println("Descending order");
System.out.println("_________________");
for(i=0;i<n;i++)
{
System.out.println(t[i]);
}
}
}