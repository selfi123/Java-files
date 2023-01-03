import java.io.*;
import java.util.Scanner;
public class CGPA {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
float sum=0;
int i;
System.out.print("Enter the number of subjects: ");
int n =sc.nextInt();
float[] sgpa=new float[n];
for(i=0;i<n;i++)
{
System.out.print("Enter the SGPA : ");
sgpa[i]=sc.nextFloat();
sum=sum+sgpa[i];
}
System.out.print("CGPA : "+(sum/n));
}
}