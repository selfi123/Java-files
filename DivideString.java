import java.io.*;
import java.util.Scanner;
public class DivideString  
{ 


    static void divide(String str, int n) 
    { 
    
        int sub_size; 
        if (str.length() % n != 0) 
        { 
            System.out.println("Invalid Input"); 
            System.out.println("String is not divisible by n"); 
            System.out.println("Try Again"); 
            return; 
        } 
        sub_size = str.length() / n; 
          
        for (int i = 0; i< str.length(); i++) 
        { 
            if(i % sub_size == 0) 
            System.out.println();  
            System.out.print(str.charAt(i)); 
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine(); 
        System.out.println("The entered string is: "+str);
System.out.print("Enter the no.of division needed :");
        int n=sc.nextInt();
        System.out.println("On dividing the entered string into "+ n +" equal parts, we have ");
        divide(str, n); 
    } 
} 