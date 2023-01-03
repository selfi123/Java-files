import java.io.*;
import java.util.Scanner;
public class Duplicate
{
public static void main(String args[])
{
int count,i,j;
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the string : ");
String s=sc.nextLine();
char arr[]=s.toCharArray();
System.out.println("Duplicate characters in a given string : ");
for(i=0;i<s.length();i++)
{
count=1;
for(j=i+1;j<s.length();j++)
{
if(arr[i]==arr[j] && arr[i]!=' ')
{
   count++;
   arr[j]='0';
}
}
if(count>1 && arr[i]!='0')
 System.out.println(arr[i]);
count=0;
}
}
}