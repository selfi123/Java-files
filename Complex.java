import java.io.*;
import java.util.Scanner;
public class Complex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number ");
System.out.print("Enter real part: ");
int a=sc.nextInt();
System.out.print("Enter image part : ");
int b=sc.nextInt();
System.out.println("Enter the Second number ");
System.out.print("Enter real part: ");
int c=sc.nextInt();
System.out.print("Enter image part : ");
int d=sc.nextInt();
System.out.print("Sum of complex numbers : "+(a+c)+"+"+(b+d)+"i");
}
}