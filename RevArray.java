import java.io.*;
import java.util.Scanner;
public class RevArray {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int sum=0,i;
System.out.print("Enter the size of array : ");
int n =sc.nextInt();    
int[] arr=new int[n];
for(i=0;i<n;i++)
{  arr[i]=sc.nextInt();
 
}
System.out.println("Reverse of array: ");
for(i=n-1;i>=0;i--)
  System.out.println(arr[i]);
}
}