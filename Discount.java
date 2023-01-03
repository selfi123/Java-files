import java.io.*;
import java.util.Scanner;
public class Discount {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.print("Enter the name of the product : ");
String name=sc.nextLine();
System.out.print("Enter the price of the product : ");
float price=sc.nextInt();
System.out.print("Enter the discount percentage : ");
float perc=sc.nextInt();
System.out.println("The product is "+perc+"% off till the Nov 6");
float b=(price/100)*perc;
System.out.println("You got "+b+"/- price discount in the following product.");
System.out.println("========================================");
System.out.println("Product         : "+name);
System.out.println("Actual price    : "+price);
System.out.println("Discount price  : "+(price-b));
System.out.print("========================================");
}
}