import java.util.*;
import java.util.Scanner;
import java.util.Collection.*; 
public class P16{

public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students: ");
int n=sc.nextInt();
ArrayList<String> list=new ArrayList<String>(n);
System.out.println("Enter Student names: \n ");
   
for(i=0;i<=n;i++)
   {
   String s=sc.nextLine();
   list.add(s);
   }
   
System.out.println("printing student names : ");
   
for (String s : list) {
      System.out.println(s);
}
}
}
