import java.io.*;
import java.util.Scanner;
import MyPackage.P1;
class Abc{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
P1 p1=new P1();
System.out.print("Enter 1st number : ");
int a=sc.nextInt();
System.out.print("Enter 2nd number : ");
int b=sc.nextInt();
System.out.println("sum = "+p1.sum(a,b));
System.out.println("Difference = "+p1.sub(10,7));
System.out.println("product = "+p1.product(10,7));
p1.prime(17);
p1.amstrong(158);
}
}