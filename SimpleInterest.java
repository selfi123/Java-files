import java.io.*;
import java.util.Scanner;
public class SimpleInterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the principle amount : ");
float p=sc.nextFloat();
System.out.print("Enter the rate : ");
float r=sc.nextFloat();
System.out.print("Enter the time span : ");
float t=sc.nextFloat();
float SI=(p*r*t)/100;
System.out.print("Simple Interest : "+SI);
}
}