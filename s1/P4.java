import java.util.*;
import java.util.Scanner;
public class P4
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
int n;
System.out.println("Enter the size of array: ");
n=sc.nextInt();
int[] arr=new int[n];
for(i=0;i<n;i++)
{
  arr[i]=sc.nextInt(); 
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
   {
   int temp=arr[j+1];
   arr[j+1]=arr[j];
   arr[j]=temp;
   
   }
}
}
System.out.println("Array after sorted : \n");
for(i=0;i<n;i++)
  System.out.print(arr[i]+" " );
}
}

