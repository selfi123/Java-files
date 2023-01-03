import java.io.*;
import java.util.Scanner;
public class NprNcr{
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }   

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.print("Enter the value for N : ");
int N=sc.nextInt();
System.out.print("Enter the value for r : ");
int r=sc.nextInt();
int ncr=factorial(N)/(factorial(r)*factorial(N-r));
int npr=factorial(N)/factorial(N-r);
 System.out.println("Npr = "+ npr);
System.out.println("Ncr = "+ ncr);
}
}