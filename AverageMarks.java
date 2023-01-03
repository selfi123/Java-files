import java.io.*;
import java.util.Scanner;
public class AverageMarks {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int sum=0;
System.out.print("Enter the no.of subjects: ");
int n =sc.nextInt();    
int arr[]=new int[n];
System.out.println("Enter the marks : ");
for(int i=0;i<n;i++)
{  
  arr[i]=sc.nextInt();
  sum=sum+arr[i];
}
System.out.print("Average marks "+(sum/n));
}
}