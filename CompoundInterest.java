import java.io.*;
import java.util.Scanner;
public class CompoundInterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double P,R,T;
System.out.print("Enter Principle amount : ");
P=sc.nextDouble();
System.out.print("Enter Rate : ");
R=sc.nextDouble();
System.out.print("Enter Time Span : ");
T=sc.nextDouble();
double CI=P*(Math.pow((1+R/100),T));
System.out.print("Compund Interest : "+ CI);


}
}