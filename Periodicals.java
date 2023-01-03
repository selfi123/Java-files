import java.io.*;
import java.util.Scanner;
public class Periodicals{
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.print("Enter a number  : ");
int a=sc.nextInt();

if(a<10 || a>50)
{
try{
a=10;
}
catch(Exception e)
  {
System.out.println(e);
}
finally{
System.out.println("error occured or not");
}
}
else
   System.out.println("Square of the number = "+Math.sqrt(a));
}}

   