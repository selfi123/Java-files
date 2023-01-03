import java.io.*;
import java.util.Scanner;
public class AverageN {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
int sum=0;
System.out.print("Enter the size of array : ");
int N =sc.nextInt();    
int[] arr=new int[N];
for(int i=0;i<N;i++)
{  arr[i]=sc.nextInt();
  sum=sum+arr[i];
}
System.out.print("Average of the N numbers entered is "+(sum/N));
}
}
