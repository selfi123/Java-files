import java.io.*;
import java.util.Scanner;
public class CountVowCon
{
public static void main(String args[])
{
int count=0,count1=0,i,j;
char a;
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the string : ");
String s=sc.nextLine();
for(i=0;i<s.length();i++)
{
a=s.charAt(i);
if(a=='A' || a=='a' || a=='E' || a=='e' || a=='I' || a=='i' || a=='O' || a=='o' || a=='U' || a=='u')
   count++;
else
   count1++;
}
System.out.println("Count of vowels in the given string is "+count+"\nCount of consonants in the given string is "+count1);
}
}
