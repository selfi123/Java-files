import java.util.*;
import java.util.Scanner;
public class P3{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n=0;
System.out.println("Enter a number : ");
int a=sc.nextInt();
for(i=2;i<a;i++)
{
if(a%i==0)
   n++;
}
if(n!=0)
 System.out.println(a+ " is not a prime number ");
 else
 System.out.println(a+" is a prime number ");
}
}
