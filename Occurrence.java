import java.io.*;
import java.util.Scanner;
public class Occurrence
{
public static void main(String args[])
{
int count,i,j;
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the string : ");
String s=sc.nextLine();
char arr[]=s.toCharArray();
System.out.println("Occurrence of characters  : ");
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
 System.out.println("OCcurence of "+ arr[i]+" is "+count);
count=0;
}
}
}