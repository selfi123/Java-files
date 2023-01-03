import java.util.*;
import java.util.Scanner;
public class P8{

void fibonacci(int n){

int c,i,a=0,b=1;
System.out.print(b);
for(i=0;i<n;i++)
{
c=a+b;
System.out.print("\t"+c);
a=b;
b=c;
}

}
public static void main(String args[])
{
P8 p=new P8();
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the limit : ");
n=sc.nextInt();
p.fibonacci(n);

}
}
