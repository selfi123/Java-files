import java.io.*;
import java.util.Scanner;
public class Leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the year to be checked: ");
int year=sc.nextInt();
if(year%400==0)
  System.out.print(year+" is a leap year.");
else if(year%4==0 && year%100!=0)
  System.out.print(year+" is a leap year.");
else
  System.out.print(year+" is a leap year.");
}
}