import java.io.*;
import java.util.Stack;
import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
int j=0,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String  : ");
String s=sc.nextLine();
Stack stack=new Stack();
for(i=0;i<s.length();i++)
{
stack.push(s.charAt(i));
}
String rev="";
while(!stack.isEmpty()){
rev=rev+stack.pop();
}
if(s.equals(rev))
 System.out.println("the input string"+s+" is palindrome. ");
else
 System.out.println("The input string is not palindrome");
}
}

