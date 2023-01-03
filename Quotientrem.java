import java.io.*;
import java.util.Scanner;
public class Quotientrem
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number : ");
int a=sc.nextInt();
System.out.print("Enter 2nd number : ");
int b=sc.nextInt();
System.out.print("Quotient : "+(a/b)+"\nReminder: "+(a%b));
}
}