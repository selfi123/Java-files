import java.io.*;
import java.util.Scanner;
public class SumOf2 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int sum=0;
System.out.print("Enter the 1st number  : ");
int a=sc.nextInt();
System.out.print("Enter the 2st number  : ");
int b=sc.nextInt();
sum=a+b;
System.out.print("Sum of 2 numbers is "+sum);
}
}