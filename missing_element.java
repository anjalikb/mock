import java.util.*;
class missing_element
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int i=0;
int sum=0;
System.out.println("enter the size of array");
int s=sc.nextInt();
int a[]=new int[s];
System.out.println("enter the elements in array");
for(i=0;i<a.length;i++)
{
  a[i]=sc.nextInt();
}
int el=s+1;
int sum_t=(el*(el+1))/2;
for(i=0;i<a.length;i++)
{
   sum=sum+a[i];
}

System.out.println("this is missing element in array"+(sum_t-sum));
}
}