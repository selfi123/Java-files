import java.io.*;
import java.util.Scanner;
public class Factorial {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.print("ENter a number : ");
int n=sc.nextInt();
int i,b=1;
for(i=1;i<=n;i++)
{
b*=i;
}
System.out.print("Factorial of the number entered :  "+b);
}
}