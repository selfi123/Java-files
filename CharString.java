import java.io.*;
import java.util.Scanner;
public class CharString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the character : ");
char c=sc.next().charAt(0);
System.out.println("Character converted : "+Character.toString(c));
sc.nextLine();
System.out.print("Enter the string  : ");
String s=sc.nextLine();
System.out.print("String converted : "+s.charAt(0));
}
}