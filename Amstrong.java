import java.io.*;
import java.util.Scanner;
public class Amstrong{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int rem,b;
double sum=0;
System.out.print("Enter a number  : ");
int a=sc.nextInt();
b=a;
while(a!=0)
{
rem=a%10;
sum=sum+Math.pow(rem,3);
a=a/10;
}
if(sum==b)
 System.out.print("Entered number is amstrong");
else
 System.out.print("Entered number is not amstrong");
}
}