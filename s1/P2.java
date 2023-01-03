import java.io.*;
import java.util.Scanner;
public class P2{

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter 1st number : ");
int a=sc.nextInt();
System.out.println("Enter 2nd number : ");
int b=sc.nextInt();
System.out.println("\n1.add\n2.sub\n3.mul\n4.div");
System.out.println("Enter the choice : ");
int c=sc.nextInt();
switch(c)
{

case 1: System.out.println("Sum = "+ (a+b));
        break;
case 2:System.out.println("Difference = "+ (a-b));
break;
case 3: System.out.println("product = "+ (a*b));
break;
case 4: System.out.println("Coefficient : "+(a/b));
break;
default: System.out.println("wrong input ");
}
}
}
