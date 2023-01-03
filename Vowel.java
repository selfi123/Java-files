import java.io.*;
import java.util.Scanner;
public class Vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.print("Enter the character to be checked : ");
c=sc.next().charAt(0);
if(c=='A' || c=='a' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
    System.out.print("Entered character is a vowel");
else
    System.out.print("Entered character is a consonant");   
}
}