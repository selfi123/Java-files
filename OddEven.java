import java.io.*;
import java.util.Scanner;
public class OddEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check whether it is odd or even : ");
int a=sc.nextInt();
if(a%2==0)
  System.out.println(a+" is even.");
else
  System.out.println(a+" is odd.");
}
}