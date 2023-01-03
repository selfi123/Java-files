import java.io.*;
import java.util.Scanner;
public class Multiply
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number : ");
int a=sc.nextInt();
System.out.print("Enter the 2nd number : ");
int b=sc.nextInt();
System.out.print("Product of 2 numbers : "+a+"*"+b+"="+(a*b));
}
}