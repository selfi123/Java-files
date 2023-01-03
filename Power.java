import java.io.*;
import java.util.Scanner;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
int a=sc.nextInt();
System.out.print("Enter the power : ");
int p=sc.nextInt();
System.out.print("Power of the number = "+Math.pow(a,p));
}
}