import java.io.*;
import java.util.Scanner;
public class SumArray {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int sum=0;
System.out.print("Enter the size of array : ");
int n =sc.nextInt();    
int[] arr=new int[n];
for(int i=0;i<n;i++)
{  arr[i]=sc.nextInt();
  sum=sum+arr[i];
}
System.out.print("Sum of elements in array  "+sum);
}
}